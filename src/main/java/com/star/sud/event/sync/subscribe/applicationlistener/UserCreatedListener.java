package com.star.sud.event.sync.subscribe.applicationlistener;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import com.star.sud.event.sync.bean.UserCreatedEvent;

@Component
public class UserCreatedListener implements ApplicationListener<UserCreatedEvent> {

	@Override
	public void onApplicationEvent(UserCreatedEvent event) {
		System.out.println(String.format("User created: %s", event.getName()));
	}
}