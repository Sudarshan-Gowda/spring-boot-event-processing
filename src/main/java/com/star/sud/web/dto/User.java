package com.star.sud.web.dto;

import java.io.Serializable;

public class User implements Serializable {

	private static final long serialVersionUID = 5572458003492179131L;

	private int userId;

	private String userName;

	public User() {
		super();
	}

	public User(int userId, String userName) {
		super();
		this.userId = userId;
		this.userName = userName;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}
