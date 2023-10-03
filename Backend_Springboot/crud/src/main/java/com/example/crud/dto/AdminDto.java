package com.example.crud.dto;

public class AdminDto {
	private int adminid;
	private String adminName;
	private String email;
	private String password;
	public AdminDto() {
		
	}
	public AdminDto(int adminid, String adminName, String email, String password) {
		super();
		this.adminid = adminid;
		this.adminName = adminName;
		this.email = email;
		this.password = password;
	}
	public int getAdminid() {
		return adminid;
	}
	public void setAdminid(int adminid) {
		this.adminid = adminid;
	}
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "AdminDto [adminid=" + adminid + ", adminName=" + adminName + ", email=" + email + ", password="
				+ password + "]";
	}
	
	
	

}
