package com.example.crud.entity;
import javax.persistence.*;

@Entity
@Table(name="admin_entity")
public class AdminEntity {
	@Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	private int adminid;
	private String adminName;
	private String email;
	private String password;
	public AdminEntity() {
		
	}
	public AdminEntity(int adminid, String adminName, String email, String password) {
		
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
		return "AdminEntity [adminid=" + adminid + ", adminName=" + adminName + ", email=" + email + ", password="
				+ password + "]";
	}
	
	
	
	

}
