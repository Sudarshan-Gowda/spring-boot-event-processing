package com.star.sud.event.async.publish;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class AsyncPublisher {

	private final ApplicationEventPublisher publisher;

	AsyncPublisher(ApplicationEventPublisher publisher) {
		this.publisher = publisher;
	}

	public void publishEvent(String name) {
		publisher.publishEvent(name);
	}

}
