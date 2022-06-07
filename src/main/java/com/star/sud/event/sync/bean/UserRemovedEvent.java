package com.star.sud.event.sync.bean;

public class UserRemovedEvent {

	private String name;

	public UserRemovedEvent(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}