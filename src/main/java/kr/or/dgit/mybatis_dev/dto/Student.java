package kr.or.dgit.mybatis_dev.dto;

import java.sql.Date;

public class Student {
	private int studid;
	private String name;
	private String email;
	private PhoneNumber phone;
	private Date dob;
	
	
	public int getStudid() {
		return studid;
	}
	public void setStudid(int studid) {
		this.studid = studid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public PhoneNumber getPhone() {
		return phone;
	}
	public void setPhone(PhoneNumber phone) {
		this.phone = phone;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	@Override
	public String toString() {
		return String.format("Student [%s, %s, %s, %s, %s]", studid, name, email, phone,
				dob);
	}
	
	
}
