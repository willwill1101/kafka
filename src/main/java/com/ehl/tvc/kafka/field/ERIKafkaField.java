package com.ehl.tvc.kafka.field;

/**
 * 汽车电子围栏系统过车数据 kafka字段描述类，基于11月16日确定的对接数据格式
 * @author lijun
 *2015年11月18日
 */
public class ERIKafkaField {
	/**
	 * 版本号
	 */
	public static final String VERSION = "VERSION";
	public static  interface VERSION1 {
		
		/**
		 * 视频号牌号码
		 */
		public static final String CAR_PLATE = "CAR_PLATE";
		
		/**
		 * 视频号牌种类
		 */
		public static final String CAR_PLATE_TYPE="CAR_PLATE_TYPE";
		
		/**
		 * 视频过车时间
		 */
		public static final String CAR_PASS_TIME="CAR_PASS_TIME";
		
		/**
		 * 视频过车行驶方向
		 */
		public static final String CAR_DIRECTION="CAR_DIRECTION";
		
		/**
		 * 视频卡口编号
		 */
		public static final String CAR_BAY_ID = "CAR_BAY_ID";
		
		/**
		 * 视频车道编号
		 */
		public static final String CAR_LANE_ID="CAR_LANE_ID";
		
		/**
		 * 车身颜色
		 */
		public static final String CAR_COLOR="CAR_COLOR";
		
		/**
		 * 车辆品牌
		 */
		public static final String CAR_BRAND="CAR_BRAND";
		
		/**
		 * 号牌颜色
		 */
		public static final String CAR_PLATE_COLOR="CAR_PLATE_COLOR";
		
		
		/**
		 * 图片地址1
		 */
		public static final String CAR_PIC1="CAR_PIC1";
		
		/**
		 * 图片地址2
		 */
		public static final String CAR_PIC2="CAR_PIC2";
		
		/**
		 * 图片地址3
		 */
		public static final String CAR_PIC3="CAR_PIC3";
		
		/**
		 * 图片1
		 */
		public static final String CAR_IMAGE1="CAR_IMAGE1";
		
		/**
		 * 图片2
		 */
		public static final String CAR_IMAGE2="CAR_IMAGE2";
		
		
		/**
		 * 图片3
		 */
		public static final String CAR_IMAGE3="CAR_IMAGE3";
		
		/**
		 * 视频设备编号
		 */
		public static final String CAR_DEVICE_NO="CAR_DEVICE_NO";
		
		
		/**
		 * 车速
		 */
		public static final String SPEED="SPEED";
		
		
		
		/**
		 * 抓拍方向
		 */
		public static final String CAMERA_ORIENTATION="CAMERA_ORIENTATION";
		
		/**
		 * 车牌坐标
		 */
		public static final String PLATE_COORDINATES="PLATE_COORDINATES";
		
		/**
		 * 驾驶室坐标
		 */
		public static final String DRIVER_COORDINATES="DRIVER_COORDINATES";
		
		/**
		 * 车辆状态
		 */
		public static final String CAR_STATUS="CAR_STATUS";
		
		/*rfid 专有采集字段 start*/
		
		/**
		 * 标识序列编号
		 */
		public static final String ERI_CID="ERI_CID";
		
		/**
		 * eri号牌号码
		 */
		public static final String ERI_PLATE="ERI_PLATE";
		
		/**
		 * eri号牌种类
		 */
		public static final String ERI_PLATE_TYPE="ERI_PLATE_TYPE";

		/**
		 * eri过车时间
		 */
		public static final String ERI_PASS_TIME="ERI_PASS_TIME";
		
		/**
		 * eri行驶方向
		 */
		public static final String ERI_DIRECTION="ERI_DIRECTION";

		/**
		 * eri卡口编号
		 */
		public static final String ERI_BAY_ID="ERI_BAY_ID";
		
		/**
		 * eri车道编号
		 */
		public static final String ERI_LANE_ID="ERI_LANE_ID";
		
		/**
		 * eri车辆类型
		 */
		public static final String ERI_VEHICLE_TYPE="ERI_VEHICLE_TYPE";
		
		/**
		 * eri使用性质
		 */
		public static final String ERI_USENATURE="ERI_USENATURE";
		
		/**
		 * eri设备编号
		 */
		public static final String ERI_DEVICE_NO="ERI_DEVICE_NO";
		
		/*rfid 专有采集字段 end*/
		
	}
	
	
	public String toDescVersion1() {
		return "VERSION=1.0							#版本号\n"
				  +"CAR_PLATE=津MA1726	#号牌号码		3\n"
				  +"CAR_PLATE_TYPE=1						#号牌种类		代码类别	261006	#车辆通行状态   云编号  260004"  
				  +"CAR_PASS_TIME=京A12345					#过车时间		2015-03-27 16:15:30 12"
				  +"CAR_DIRECTION=2							#视频过车行驶方向  代码类别	261004"
				  +"CAR_BAY_ID=100							#卡口编号                    t_itgs_tgsinfo kkid字段 "
				  +"CAR_LANE_ID=1						    #车道编号		代码类别          260010"
				  +"CAR_COLOR=abcde							#车身颜色		代码类别          261003"
				  +"CAR_BRAND=127							#车辆品牌		代码类别	260012"
				  +"CAR_PLATE_COLOR=1						#号牌颜色		代码类别          261005"
				  +"CAR_PIC1=http://127.0.0.1/a.jpg			#图片地址1		"
				  +"CAR_PIC2=								#图片地址2		"
				  +"CAR_PIC3=								#图片地址3		"
				  +"CAR_IMAGE1=								#图片1	              二进制格式图片    "
				  +"CAR_IMAGE2=								#图片2		二进制格式图片"
				  +"CAR_IMAGE3=								#图片3		二进制格式图片"
				  +"CAR_DEVICE_NO=1234567					#视频设备编号		"
				  +"SPEED=http://127.0.0.1/car.jpg		#全景图片		不可空	如果地址不以http开头需要加图片服务器前缀"
				  +"CAMERA_ORIENTATION=1		     #抓拍方向		代码类别          260003"
				  +"PLATE_COORDINATES=0;0;0;0\n							#号牌坐标		"
				  +"DRIVER_COORDINATES=0;0;0;0                          #驾驶室坐标		"
				  +"CAR_STATUS=1                                         #车辆通行状态   代码类别  260004"
				  +"ERI_CID=            #标识序列编号"
				  +"ERI_PLATE=          #eri号牌号码"
				  +"ERI_PLATE_TYPE=     #eri号牌种类   "
				  +"ERI_PASS_TIME=      #eri过车时间"
				  +"ERI_DIRECTION=      #eri行驶方向"
				  +"ERI_BAY_ID=         #eri卡口编号"
				  +"ERI_LANE_ID=        #eri车道编号"
				  +"ERI_VEHICLE_TYPE=   #eri车辆类型"
				  +"ERI_USENATURE=      #eri使用性质"
				  +"ERI_DEVICE_NO=      #eri设备编号";
	}
	
//	public String toDescVersion1(){
//		return "VERSION=1.0							#版本号\n"
//			  +"CAR_PASS_TIME=2015-03-25 13:25:40 456	#过车时间 		2015-03-27 16:15:30 123\n"
//			  +"CAR_STATUS=1							#车辆通行状态   云编号  260004"  
//			  +"CAR_PLATE=京A12345					#号牌号码		云编号	"
//			  +"CAR_PLATE_TYPE=2							#号牌种类		云编号	261006"
//			  +"SPEED=100							#行驶速度                                                      "
//			  +"PLATECOLOR=							#号牌颜色		云编号	261005"
//			  +"LOCATIONID=abcde					#设备编号		          "
//			  +"DRIVEWAY=1							#车道编号		云编号	260010"
//			  +"DRIVEDIR=1							#行驶方向		云编号	261004"
//			  +"CAPTUREDIR=1						#抓拍方向		云编号	260003"
//			  +"CARCOLOR=1							#车身颜色		云编号	261003"
//			  +"CARBRAND=99							#车辆品牌		代码，暂无代码，全部用99代替"
//			  +"CARBRANDZW=奥迪						#车辆品牌		汉字，厂家上传"
//			  +"TGSID=1								#卡口编号		云编号	t_itgs_tgsinfo  cloud_id字段"
//			  +"PLATECOORD=0,0,0,0					#车牌坐标		无用0,0,0,0代替"
//			  +"CABCOORD=0,0,0,0					#驾驶室坐标		无用0,0,0,0代替"
//			  +"IMGID1=http://127.0.0.1/car.jpg		#全景图片		不可空	如果地址不以http开头需要加图片服务器前缀"
//			  +"IMGID2=/tgs/2015/03/25/car.jpg		#特征图片		可空"
//			  +"IMGID3=\n							#车牌图片		可空";
//	}
}
