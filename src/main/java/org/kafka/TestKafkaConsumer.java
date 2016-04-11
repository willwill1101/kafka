package org.kafka;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import kafka.consumer.Consumer;
import kafka.consumer.ConsumerConfig;
import kafka.consumer.ConsumerIterator;
import kafka.consumer.KafkaStream;
import kafka.javaapi.consumer.ConsumerConnector;
import kafka.utils.threadsafe;




/**
 * 接收数据
 * 接收到: message: 10
接收到: message: 11
接收到: message: 12
接收到: message: 13
接收到: message: 14
 * @author zm
 *
 */
public class TestKafkaConsumer extends Thread{

	private String topic;
	
	public TestKafkaConsumer(String topic){
		super();
		this.topic = topic;
	}
	
	
	@Override
	public void run() {
		ConsumerConnector consumer = createConsumer();
		Map<String, Integer> topicCountMap = new HashMap<String, Integer>();
		topicCountMap.put(topic,1); // 一次从主题中获取一个数据
		 Map<String, List<KafkaStream<byte[], byte[]>>>  messageStreams = consumer.createMessageStreams(topicCountMap);
		 List<KafkaStream<byte[], byte[]>> streams = messageStreams.get(topic);// 获取每次接收到的这个数据
		for(KafkaStream<byte[], byte[]> stream :streams){
			new ReadData(stream).start();
			System.out.println("dadada");
		}
	}

	private ConsumerConnector createConsumer() {
		Properties properties = new Properties();
		properties.put("zookeeper.connect", "host46:2181,host47:2181,host48:2181");//声明zk
		properties.put("group.id", "group2111");// 必须要使用别的组名称， 如果生产者和消费者都在同一组，则不能访问同一组内的topic数据
		properties.put("fetch.message.max.bytes", "10485760");// 必须要使用别的组名称， 如果生产者和消费者都在同一组，则不能访问同一组内的topic数据
		ConsumerConfig consumerConfig= new ConsumerConfig(properties);
		System.out.println(consumerConfig.fetchMessageMaxBytes());
		return Consumer.createJavaConsumerConnector(consumerConfig);
	 }
	
	
	public static void main(String[] args) {
		new TestKafkaConsumer("yangx").start();// 使用kafka集群中创建好的主题 test 
		
	}
	
	class ReadData extends Thread{
		private KafkaStream<byte[], byte[]> stream=null;
		public ReadData(KafkaStream<byte[], byte[]> _stream){
			stream=_stream;
		}
		@Override
		public void run() {
			 ConsumerIterator<byte[], byte[]> iterator =  stream.iterator();
			 while(iterator.hasNext()){
				 String message = new String(iterator.next().message());
				 System.out.println("接收到: "+message);
			 }
		}
		
	} 
	
	 
}
