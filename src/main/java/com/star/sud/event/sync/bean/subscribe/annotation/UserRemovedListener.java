package com.star.sud.event.sync.bean.subscribe.annotation;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.star.sud.event.sync.bean.UserRemovedEvent;

@Component
class UserRemovedListener {

	@EventListener
	ReturnedEvent handleUserRemovedEvent(UserRemovedEvent event) {
		event.setName(event.getName() + "##");
		return new ReturnedEvent(event.getName());
	}

	@EventListener
	void handleReturnedEvent(ReturnedEvent event) {
		try {
			System.out.println(new ObjectMapper().writeValueAsString(event));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}