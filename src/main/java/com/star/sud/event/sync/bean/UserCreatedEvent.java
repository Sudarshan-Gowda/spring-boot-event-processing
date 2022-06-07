package com.star.sud.event.sync.bean;

import org.springframework.context.ApplicationEvent;

public class UserCreatedEvent extends ApplicationEvent {

	private static final long serialVersionUID = 1393033808219429061L;

	private String name;

	public UserCreatedEvent(Object source, String name) {
		super(source);
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}