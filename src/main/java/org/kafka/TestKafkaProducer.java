package org.kafka;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.kafka.TvcCar.VERSION;

import kafka.javaapi.producer.Producer;
import kafka.producer.KeyedMessage;
import kafka.producer.ProducerConfig;


public class TestKafkaProducer {
	public static void main(String[] args) throws UnsupportedEncodingException, InterruptedException {
		while(true){
			int num =100;
			for(int i=0;i<num;i++){
				send("消息"+i);
			}
			Thread.sleep(1000);
		}
		
		
	}
	
	private static void send (String mes) throws UnsupportedEncodingException{
		Properties props = new Properties();
		//只用于获取metadata，可以配置为kafka集群的自己
		props.put("metadata.broker.list", "host48:9092,host49:9092,host50:9092");
		props.put("request.required.acks", "1");//最小副本数
		props.put("serializer.class", "kafka.serializer.DefaultEncoder");
		props.put("request.timeout.ms", "10000");//请求的超时时间
		props.put("producer.type", "async");//异步  sync  同步
		props.put("compression.codec", "snappy");//压缩方式 gzip  snappy  none
		ProducerConfig config = new ProducerConfig(props);
		Producer<String, byte[]> producer= new Producer<String, byte[]>(config);

		byte[] carbytes = mes.getBytes("UTF-8");
		ByteBuffer buf = ByteBuffer.allocate(4 + carbytes.length);
		buf.order(ByteOrder.LITTLE_ENDIAN);
		buf.putInt(carbytes.length);
		buf.put(carbytes);
		buf.flip();
		
		
		KeyedMessage<String,byte[]> km = new KeyedMessage<>("yangx",buf.array());
		producer.send(km);
		producer.close();
		System.out.println("发送："+new String(carbytes));
	}
}
