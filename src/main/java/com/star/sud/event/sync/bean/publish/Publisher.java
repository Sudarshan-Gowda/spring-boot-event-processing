package com.star.sud.event.sync.bean.publish;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import com.star.sud.event.sync.bean.UserCreatedEvent;
import com.star.sud.event.sync.bean.UserRemovedEvent;

@Component
public class Publisher {

	private final ApplicationEventPublisher publisher;

	Publisher(ApplicationEventPublisher publisher) {
		this.publisher = publisher;
	}

	public void publishEventBasedOnAppEvent(String name) {
		// Publishing event created by extending ApplicationEvent
		publisher.publishEvent(new UserCreatedEvent(this, name));

	}

	public void publishEventBasedOnObject(String name) {
		// Publishing an object as an event
		publisher.publishEvent(new UserRemovedEvent(name));
	}
}