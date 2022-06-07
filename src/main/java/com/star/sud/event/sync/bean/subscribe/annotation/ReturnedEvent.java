package com.star.sud.event.sync.bean.subscribe.annotation;

// Empty class to showcase spring creates an event for non-void returned events
public class ReturnedEvent {

	private String name;

	public ReturnedEvent() {
		super();
	}

	public ReturnedEvent(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}