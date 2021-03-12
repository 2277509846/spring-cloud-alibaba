/*
<<<<<<< HEAD
 * Copyright 2013-2018 the original author or authors.
=======
 * Copyright (C) 2018 the original author or authors.
>>>>>>> 1.x
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
<<<<<<< HEAD
 *      https://www.apache.org/licenses/LICENSE-2.0
=======
 *      http://www.apache.org/licenses/LICENSE-2.0
>>>>>>> 1.x
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.alibaba.cloud.examples.rocketmq;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.bus.event.AckRemoteApplicationEvent;
import org.springframework.cloud.bus.jackson.RemoteApplicationEventScan;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.event.EventListener;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
<<<<<<< HEAD
 * RocketMQ Bus Spring Application.
=======
 * RocketMQ Bus Spring Application
>>>>>>> 1.x
 *
 * @author <a href="mailto:mercyblitz@gmail.com">Mercy</a>
 * @since 0.2.1
 */
@RestController
@EnableAutoConfiguration
@RemoteApplicationEventScan(basePackages = "com.alibaba.cloud.examples.rocketmq")
public class RocketMQBusApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(RocketMQBusApplication.class)
				.properties("server.port=0") // Random server port
<<<<<<< HEAD
				.properties("management.endpoints.web.exposure.include=*") // exposure
																			// includes
																			// all
=======
				.properties("management.security.enabled=false") // exposure includes all
>>>>>>> 1.x
				.properties("spring.cloud.bus.trace.enabled=true") // Enable trace
				.run(args);
	}

	@Autowired
	private ApplicationEventPublisher publisher;

	@Value("${spring.cloud.bus.id}")
	private String originService;

	@Value("${server.port}")
	private int localServerPort;

	@Autowired
	private ObjectMapper objectMapper;

	/**
<<<<<<< HEAD
	 * Publish the {@link UserRemoteApplicationEvent}.
=======
	 * Publish the {@link UserRemoteApplicationEvent}
	 *
>>>>>>> 1.x
	 * @param name the user name
	 * @param destination the destination
	 * @return If published
	 */
	@GetMapping("/bus/event/publish/user")
	public boolean publish(@RequestParam String name,
			@RequestParam(required = false) String destination) {
		User user = new User();
		user.setId(System.currentTimeMillis());
		user.setName(name);
		publisher.publishEvent(
				new UserRemoteApplicationEvent(this, user, originService, destination));
		return true;
	}

	/**
<<<<<<< HEAD
	 * Listener on the {@link UserRemoteApplicationEvent}.
=======
	 * Listener on the {@link UserRemoteApplicationEvent}
	 *
>>>>>>> 1.x
	 * @param event {@link UserRemoteApplicationEvent}
	 */
	@EventListener
	public void onEvent(UserRemoteApplicationEvent event) {
		System.out.printf("Server [port : %d] listeners on %s\n", localServerPort,
				event.getUser());
	}

	@EventListener
	public void onAckEvent(AckRemoteApplicationEvent event)
			throws JsonProcessingException {
		System.out.printf("Server [port : %d] listeners on %s\n", localServerPort,
				objectMapper.writeValueAsString(event));
	}
<<<<<<< HEAD

=======
>>>>>>> 1.x
}
