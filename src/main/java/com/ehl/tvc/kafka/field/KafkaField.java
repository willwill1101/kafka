package com.ehl.tvc.kafka.field;

public class KafkaField {
	/**
	 * 版本号
	 */
	public static final String VERSION = "VERSION";
	public static  interface VERSION1 {
		/**
		 * 接入Webservice的时间
		 */
		public static final String WEBSYSTIME = "WEBSYSTIME";
		/**
		 * 过车时间
		 */
		public static final String PASSTIME ="PASSTIME";
		/**
		 * 车辆通行状态
		 */
		public static final String CARSTATE = "CARSTATE";
		/**
		 * 号牌号码
		 */
		public static final String CARPLATE = "CARPLATE";
		/**
		 * 号牌种类
		 */
		public static final String PLATETYPE = "PLATETYPE";
		/**
		 * 行驶速度
		 */
		public static final String SPEED = "SPEED";
		/**
		 * 号牌颜色
		 */
		public static final String PLATECOLOR = "PLATECOLOR";
		/**
		 * 设备编号
		 */
		public static final String LOCATIONID = "LOCATIONID";
		/**
		 * 设备编号
		 */
		public static final String DEVICEID = "DEVICEID";
		/**
		 * 车道编号
		 */
		public static final String DRIVEWAY = "DRIVEWAY";
		/**
		 * 行驶方向
		 */
		public static final String DRIVEDIR = "DRIVEDIR";
		/**
		 * 抓拍方向
		 */
		public static final String CAPTUREDIR = "CAPTUREDIR";
		/**
		 * 车身颜色
		 */
		public static final String CARCOLOR = "CARCOLOR";
		/**
		 * 车辆品牌
		 */
		public static final String CARBRAND = "CARBRAND";
		/**
		 * 车辆中文品牌
		 */
		public static final String CARBRANDZW = "CARBRANDZW";
		/**
		 * 卡口编号
		 */
		public static final String TGSID = "TGSID";
		/**
		 * 车牌坐标
		 */
		public static final String PLATECOORD = "PLATECOORD";
		/**
		 * 驾驶室坐标
		 */
		public static final String CABCOORD = "CABCOORD";
		/**
		 * 全景图
		 */
		public static final String IMGID1 = "IMGID1";
		/**
		 * 特征图
		 */
		public static final String IMGID2 = "IMGID2";
		/**
		 * 号牌图
		 */
		public static final String IMGID3 = "IMGID3";
		
		/**
		 * 电子围栏新增字段，RFID车牌号
		 */
		public static final String RFIDCARPLATE="RFIDCARPLATE";
		
		/**
		 * 电子围栏系统新增字段，RFID卡口编号
		 */
		public static final String RFIDBAYID="RFIDBAYID";
		
		/**
		 * 电子围栏系统新增字段，RFID标识序列编号
		 */
		public static final String CIDCODE="CIDCODE";
		
	}
	public String toDescVersion1(){
		return "VERSION=1.0							#版本号\n"
			  +"WEBSYSTIME=2015-03-25 13:25:40 456 #数据接入Webservice的时间用于排查系统延时\n"
			  +"PASSTIME=2015-03-25 13:25:40 456	#过车时间 		2015-03-27 16:15:30 123\n"
			  +"CARSTATE=1							#车辆通行状态   云编号  260004"  
			  +"CARPLATE=京A12345					#号牌号码		云编号	"
			  +"PLATETYPE=2							#号牌种类		云编号	261006"
			  +"SPEED=100							#行驶速度                                                      "
			  +"PLATECOLOR=							#号牌颜色		云编号	261005"
			  +"LOCATIONID=abcde					#设备编号		          "
			  +"DRIVEWAY=1							#车道编号		云编号	260010"
			  +"DRIVEDIR=1							#行驶方向		云编号	261004"
			  +"CAPTUREDIR=1						#抓拍方向		云编号	260003"
			  +"CARCOLOR=1							#车身颜色		云编号	261003"
			  +"CARBRAND=99							#车辆品牌		代码，暂无代码，全部用99代替"
			  +"CARBRANDZW=奥迪						#车辆品牌		汉字，厂家上传"
			  +"TGSID=1								#卡口编号		云编号	t_itgs_tgsinfo  cloud_id字段"
			  +"PLATECOORD=0,0,0,0					#车牌坐标		无用0,0,0,0代替"
			  +"CABCOORD=0,0,0,0					#驾驶室坐标		无用0,0,0,0代替"
			  +"IMGID1=http://127.0.0.1/car.jpg		#全景图片		不可空	如果地址不以http开头需要加图片服务器前缀"
			  +"IMGID2=/tgs/2015/03/25/car.jpg		#特征图片		可空"
			  +"IMGID3=\n							#车牌图片		可空";
	}
}
