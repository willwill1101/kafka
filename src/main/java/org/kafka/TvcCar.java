package org.kafka;

import java.io.Serializable;

import com.ehl.tvc.kafka.field.KafkaField;
import com.ehl.tvc.kafka.field.KafkaField.VERSION1;

/**
 * @ClassName: TvcCar
 * @Description: 车行云内部过车数据信息
 * @author 卢海友
 * @date 2015-3-24 下午3:28:07
 */
public class TvcCar implements Serializable {

	private static final long serialVersionUID = -3372308120661141446L;

	public static enum VERSION {
		V1
	}

	private String webSystime;

	public String getWebSystime() {
		return webSystime;
	}

	public void setWebSystime(String webSystime) {
		this.webSystime = webSystime;
	}

	/**
	 * 号牌号码
	 */
	private String hphm;
	/**
	 * 号牌种类
	 */
	private String hpzl;
	/**
	 * 车道编号
	 */
	private String cdbh;
	/**
	 * 通过时间
	 */
	private String tgsj;
	/**
	 * 行驶速度
	 */
	private String xssd;
	/**
	 * 号牌颜色
	 */
	private String hpys;
	/**
	 * 车行方向
	 */
	private String cxfx;
	/**
	 * 抓拍方向
	 */
	private String zpfx;
	/**
	 * 车身颜色
	 */
	private String csys;
	/**
	 * 卡口编号
	 */
	private String kkbh;
	/**
	 * 设备编号
	 */
	private String sbbh;
	/**
	 * 车辆通行状态
	 */
	private String cltxzt;
	/**
	 * 车辆品牌
	 */
	private String clpp;
	/**
	 * 车辆中文品牌
	 */
	private String clzwpp;

	public String getClzwpp() {
		return clzwpp;
	}

	public void setClzwpp(String clzwpp) {
		this.clzwpp = clzwpp;
	}

	/**
	 * 车牌坐标
	 */
	private String cpzb;
	/**
	 * 驾驶室坐标
	 */
	private String jsszb;
	/**
	 * 图片路径1-全景图像
	 */
	private String tplj1;
	/**
	 * 图片路径2-特制图像
	 */
	private String tplj2;
	/**
	 * 图片路径3-号牌图像
	 */
	private String tplj3;// 号牌图像
	
	
	private String rfidCarPlate; //rfid 车牌号
	private String rfidBayId; //rfid 卡点编号
	private String cidCode; //标识编号
	public String getRfidCarPlate() {
		return rfidCarPlate;
	}

	public void setRfidCarPlate(String rfidCarPlate) {
		this.rfidCarPlate = rfidCarPlate;
	}

	public String getRfidBayId() {
		return rfidBayId;
	}

	public void setRfidBayId(String rfidBayId) {
		this.rfidBayId = rfidBayId;
	}

	public String getCidCode() {
		return cidCode;
	}

	public void setCidCode(String cidCode) {
		this.cidCode = cidCode;
	}

	

	public String getCdbh() {
		return cdbh;
	}

	public String getClpp() {
		return clpp;
	}

	public String getCltxzt() {
		return cltxzt;
	}

	public String getCpzb() {
		return cpzb;
	}

	public String getCsys() {
		return csys;
	}

	public String getCxfx() {
		return cxfx;
	}

	public String getHphm() {
		return hphm;
	}

	public String getHpys() {
		return hpys;
	}

	public String getHpzl() {
		return hpzl;
	}

	public String getJsszb() {
		return jsszb;
	}

	public String getKkbh() {
		return kkbh;
	}

	public String getSbbh() {
		return sbbh;
	}

	public String getTgsj() {
		return tgsj;
	}

	public String getTplj1() {
		return tplj1;
	}

	public String getTplj2() {
		return tplj2;
	}

	public String getTplj3() {
		return tplj3;
	}

	public String getXssd() {
		return xssd;
	}

	public String getZpfx() {
		return zpfx;
	}

	public void setCdbh(String cdbh) {
		this.cdbh = cdbh;
	}

	public void setClpp(String clpp) {
		this.clpp = clpp;
	}

	public void setCltxzt(String cltxzt) {
		this.cltxzt = cltxzt;
	}

	public void setCpzb(String cpzb) {
		this.cpzb = cpzb;
	}

	public void setCsys(String csys) {
		this.csys = csys;
	}

	public void setCxfx(String cxfx) {
		this.cxfx = cxfx;
	}

	public void setHphm(String hphm) {
		this.hphm = hphm;
	}

	public void setHpys(String hpys) {
		this.hpys = hpys;
	}

	public void setHpzl(String hpzl) {
		this.hpzl = hpzl;
	}

	public void setJsszb(String jsszb) {
		this.jsszb = jsszb;
	}

	public void setKkbh(String kkbh) {
		this.kkbh = kkbh;
	}

	public void setSbbh(String sbbh) {
		this.sbbh = sbbh;
	}

	public void setTgsj(String tgsj) {
		this.tgsj = tgsj;
	}

	public void setTplj1(String tplj1) {
		this.tplj1 = tplj1;
	}

	public void setTplj2(String tplj2) {
		this.tplj2 = tplj2;
	}

	public void setTplj3(String tplj3) {
		this.tplj3 = tplj3;
	}

	public void setXssd(String xssd) {
		this.xssd = xssd;
	}

	public void setZpfx(String zpfx) {
		this.zpfx = zpfx;
	}

	public String toKafkaString(VERSION v) {
		switch (v) {
		case V1:
			return toKafkaStringV1();
		default:
			throw new RuntimeException("版本号错误");
		}
	}

	private String toKafkaStringV1() {
		StringBuffer sb = new StringBuffer();
		sb.append(KafkaField.VERSION).append("=1.0\n");// 版本号1.0
		sb.append(VERSION1.PASSTIME).append("=" +(this.tgsj) + "\n");
		sb.append(VERSION1.CARSTATE).append("=" +(this.cltxzt) + "\n");
		sb.append(VERSION1.CARPLATE).append("=" +(this.hphm) + "\n");
		sb.append(VERSION1.PLATETYPE).append("=" +(this.hpzl) + "\n");
		sb.append(VERSION1.SPEED).append("=" +(this.xssd) + "\n");
		sb.append(VERSION1.PLATECOLOR).append("=" +(this.hpys) + "\n");
		//设备编号做一次冗余
		sb.append(VERSION1.LOCATIONID).append("=" +(this.sbbh) + "\n");
		sb.append(VERSION1.DEVICEID).append("=" +(this.sbbh) + "\n");
		sb.append(VERSION1.DRIVEWAY).append("=" +(this.cdbh) + "\n");
		sb.append(VERSION1.DRIVEDIR).append("=" +(this.cxfx) + "\n");
		sb.append(VERSION1.CAPTUREDIR).append("=" +(this.zpfx) + "\n");
		sb.append(VERSION1.CARCOLOR).append("=" +(this.csys) + "\n");
		sb.append(VERSION1.CARBRAND).append("=" +(this.clpp) + "\n");
		sb.append(VERSION1.CARBRANDZW).append("=" +(this.clzwpp) + "\n");// 中文车辆品牌
		sb.append(VERSION1.TGSID).append("=" +(this.kkbh) + "\n");
		sb.append(VERSION1.PLATECOORD).append("=" +(this.cpzb) + "\n");
		sb.append(VERSION1.CABCOORD).append("=" +(this.jsszb) + "\n");
		sb.append(VERSION1.IMGID1).append("=" +(this.tplj1) + "\n");
		sb.append(VERSION1.IMGID2).append("=" +(this.tplj2) + "\n");
		sb.append(VERSION1.IMGID3).append("=" +(this.tplj3) + "\n");
		return sb.toString();
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append(KafkaField.VERSION).append("=1.0,");// 版本号1.0
		sb.append(VERSION1.PASSTIME).append("=" +(this.tgsj) + ",");
		sb.append(VERSION1.CARSTATE).append("=" +(this.cltxzt) + ",");
		sb.append(VERSION1.CARPLATE).append("=" +(this.hphm) + ",");
		sb.append(VERSION1.PLATETYPE).append("=" +(this.hpzl) + ",");
		sb.append(VERSION1.SPEED).append("=" +(this.xssd) + ",");
		sb.append(VERSION1.PLATECOLOR).append("=" +(this.hpys) + ",");
		//设备编号做一次冗余
		sb.append(VERSION1.LOCATIONID).append("=" +(this.sbbh) + ",");
		sb.append(VERSION1.DEVICEID).append("=" +(this.sbbh) + ",");
		sb.append(VERSION1.DRIVEWAY).append("=" +(this.cdbh) + ",");
		sb.append(VERSION1.DRIVEDIR).append("=" +(this.cxfx) + ",");
		sb.append(VERSION1.CAPTUREDIR).append("=" +(this.zpfx) + ",");
		sb.append(VERSION1.CARCOLOR).append("=" +(this.csys) + ",");
		sb.append(VERSION1.CARBRAND).append("=" +(this.clpp) + ",");
		sb.append(VERSION1.CARBRANDZW).append("=" +(this.clzwpp) + ",");// 中文车辆品牌
		sb.append(VERSION1.TGSID).append("=" +(this.kkbh) + ",");
		sb.append(VERSION1.PLATECOORD).append("=" +(this.cpzb) + ",");
		sb.append(VERSION1.CABCOORD).append("=" +(this.jsszb) + ",");
		sb.append(VERSION1.IMGID1).append("=" +(this.tplj1) + ",");
		sb.append(VERSION1.IMGID2).append("=" +(this.tplj2) + ",");
		sb.append(VERSION1.IMGID3).append("=" +(this.tplj3) + ",");
		return sb.toString();
	}
}
