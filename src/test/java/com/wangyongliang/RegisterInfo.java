package com.wangyongliang;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/** 
 * @author 刘吉飞
 * @version 创建时间：2019年9月12日 上午10:03:21
 * 类功能说明 
 */
public class RegisterInfo {

	//于克祥|男|北京市|北京铁研建设监理有限责任公司|工程机械|房屋建筑工程|电力工程|90164|11007719|2021.06.15
	
		//“ID，姓名，性别，省市，申请注册单位，所学专业，申请注册专业1，申请注册专业2，执业资格证书编号，注册号，有效期
		private Integer id;
		private String name ;
		private String sex ;
		private String address;
		private String qy ;
		
		private String zy ;
		private String sqzczy1 ;
		
		private String sqzczy2 ;
		private String zsbh ;
		private String zch ;
		private Date yxq ;
		
		
		
		public RegisterInfo(String name, String sex,String address, String qy, String zy, String sqzczy1, String sqzczy2,
				 String zsbh, String zch, String yxq) throws ParseException {
			super();
			//this.id = Integer.parseInt(id);
			this.name = name;
			this.sex = sex;
			this.address=address;
			this.qy = qy;
			this.zy = zy;
			this.sqzczy1 = sqzczy1;
			this.sqzczy2 = sqzczy2;
			this.zsbh = zsbh;
			this.zch = zch;
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy.MM.dd");
			this.yxq = simpleDateFormat.parse(yxq);
			
		}
		
		
		public RegisterInfo() {
			super();
		}


		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getSex() {
			return sex;
		}
		public void setSex(String sex) {
			this.sex = sex;
		}
		public String getQy() {
			return qy;
		}
		public void setQy(String qy) {
			this.qy = qy;
		}
		public String getZy() {
			return zy;
		}
		public void setZy(String zy) {
			this.zy = zy;
		}
		public String getSqzczy1() {
			return sqzczy1;
		}
		public void setSqzczy1(String sqzczy1) {
			this.sqzczy1 = sqzczy1;
		}
		public String getSqzczy2() {
			return sqzczy2;
		}
		public void setSqzczy2(String sqzczy2) {
			this.sqzczy2 = sqzczy2;
		}

		public String getZsbh() {
			return zsbh;
		}
		public void setZsbh(String zsbh) {
			this.zsbh = zsbh;
		}
		public String getZch() {
			return zch;
		}
		public void setZch(String zch) {
			this.zch = zch;
		}
		public Date getYxq() {
			return yxq;
		}
		public void setYxq(Date yxq) {
			this.yxq = yxq;
		}


		public String getAddress() {
			return address;
		}


		public void setAddress(String address) {
			this.address = address;
		}


		@Override
		public String toString() {
			return "RegisterInfo [id=" + id + ", name=" + name + ", sex=" + sex
					+ ", address=" + address + ", qy=" + qy + ", zy=" + zy
					+ ", sqzczy1=" + sqzczy1 + ", sqzczy2=" + sqzczy2
					+ ", zsbh=" + zsbh + ", zch=" + zch + ", yxq=" + yxq + "]";
		}



}
