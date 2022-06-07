package com.star.sud.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.star.sud.event.sync.bean.publish.Publisher;
import com.star.sud.web.dto.User;

@RestController
public class UserConntroller {

	@Autowired
	private Publisher publisher;

	@PostMapping("/user")
	public @ResponseBody ResponseEntity<Object> createUser(@RequestBody User user) throws Exception {

		// Do the process in Service and DAO layer
		// Publish the event once user has been created
		publisher.publishEventBasedOnAppEvent("User Created: " + new ObjectMapper().writeValueAsString(user));

		return ResponseEntity.ok().body("User Created!!");
	}

	@DeleteMapping("/user/{id}")
	public void deleteUser(@PathVariable("id") Integer userId) {
		// Do the process in Service and DAO layer
		publisher.publishEventBasedOnObject("User removed: " + userId);

	}

}
