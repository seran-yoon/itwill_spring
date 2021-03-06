package com.class1.spring;

import java.util.Date;

//DTO (DataBean, Data transfer, VO) 
public class Member {
	
	private Long id;
	private String email;
	private String password;
	private String name;
	private Date registerDate;
	
	public Long getId() {
		return id;
	}
	public String getEmail() {
		return email;
	}
	public String getPassword() {
		return password;
	}
	public String getName() {
		return name;
	}
	public Date getRegisterDate() {
		return registerDate;
	}
		
	public void setId(Long id) {
		this.id = id;
	}

	public Member(String email, String password, String name, Date registerDate) {
		this.email = email;
		this.password = password;
		this.name = name;
		this.registerDate = registerDate;
	}
	
	public void changePassword(String oldPassword, String newPassword) {
		if(!password.equals(oldPassword)) {
			throw new IdpasswordNotMatchingException();
		}
		
		this.password = newPassword;
	}
	
}
