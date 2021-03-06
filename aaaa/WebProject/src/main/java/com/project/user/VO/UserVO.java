package com.project.user.VO;

import java.sql.Timestamp;

public class UserVO {
	
	private String email;
	private String name;
	private String phone;
	private String pw;
	private String postalCode;
	private String address1;
	private String address2;
	private Timestamp regdate;
	
	public UserVO() {
		
	}

	public UserVO(String email, String name, String phone, String pw, String postalCode, String address1,
			String address2, Timestamp regdate) {
		super();
		this.email = email;
		this.name = name;
		this.phone = phone;
		this.pw = pw;
		this.postalCode = postalCode;
		this.address1 = address1;
		this.address2 = address2;
		this.regdate = regdate;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public Timestamp getRegdate() {
		return regdate;
	}

	public void setRegdate(Timestamp regdate) {
		this.regdate = regdate;
	}
	
	



	
	
	
	
}
