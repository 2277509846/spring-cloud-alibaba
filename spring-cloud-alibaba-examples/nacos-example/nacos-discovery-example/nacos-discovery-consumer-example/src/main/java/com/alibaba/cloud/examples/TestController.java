<<<<<<< HEAD
/*
 * Copyright 2013-2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

=======
>>>>>>> 1.x
package com.alibaba.cloud.examples;

import com.alibaba.cloud.examples.ConsumerApplication.EchoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
=======
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
>>>>>>> 1.x
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author xiaojing
 */
@RestController
public class TestController {

	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private RestTemplate restTemplate1;

	@Autowired
	private EchoService echoService;

	@Autowired
	private DiscoveryClient discoveryClient;

	// @PostConstruct
	// public void init() {
	// restTemplate1.setErrorHandler(new ResponseErrorHandler() {
	// @Override
	// public boolean hasError(ClientHttpResponse response) throws IOException {
	// return false;
	// }
	//
	// @Override
	// public void handleError(ClientHttpResponse response) throws IOException {
	// System.err.println("handle error");
	// }
	// });
	// }

<<<<<<< HEAD
	@GetMapping("/echo-rest/{str}")
	public String rest(@PathVariable String str) {
		return restTemplate.getForObject("http://service-provider/echo/" + str,
				String.class);
	}

	@GetMapping("/index")
	public String index() {
		return restTemplate1.getForObject("http://service-provider", String.class);
	}

	@GetMapping("/test")
	public String test() {
		return restTemplate1.getForObject("http://service-provider/test", String.class);
	}

	@GetMapping("/sleep")
	public String sleep() {
		return restTemplate1.getForObject("http://service-provider/sleep", String.class);
	}

	@GetMapping("/notFound-feign")
=======
	@RequestMapping(value = "/echo-rest/{str}", method = RequestMethod.GET)
	public String rest(@PathVariable String str) {
		return restTemplate.getForObject("http://service-provider-1X/echo/" + str,
				String.class);
	}

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index() {
		return restTemplate1.getForObject("http://service-provider-1X", String.class);
	}

	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String test() {
		return restTemplate1.getForObject("http://service-provider-1X/test",
				String.class);
	}

	@RequestMapping(value = "/sleep", method = RequestMethod.GET)
	public String sleep() {
		return restTemplate1.getForObject("http://service-provider-1X/sleep",
				String.class);
	}

	@RequestMapping(value = "/notFound-feign", method = RequestMethod.GET)
>>>>>>> 1.x
	public String notFound() {
		return echoService.notFound();
	}

<<<<<<< HEAD
	@GetMapping("/divide-feign")
=======
	@RequestMapping(value = "/divide-feign", method = RequestMethod.GET)
>>>>>>> 1.x
	public String divide(@RequestParam Integer a, @RequestParam Integer b) {
		return echoService.divide(a, b);
	}

<<<<<<< HEAD
	@GetMapping("/divide-feign2")
	public String divide(@RequestParam Integer a) {
		return echoService.divide(a);
	}

	@GetMapping("/echo-feign/{str}")
=======
	@RequestMapping(value = "/echo-feign/{str}", method = RequestMethod.GET)
>>>>>>> 1.x
	public String feign(@PathVariable String str) {
		return echoService.echo(str);
	}

<<<<<<< HEAD
	@GetMapping("/services/{service}")
=======
	@RequestMapping(value = "/services/{service}", method = RequestMethod.GET)
>>>>>>> 1.x
	public Object client(@PathVariable String service) {
		return discoveryClient.getInstances(service);
	}

<<<<<<< HEAD
	@GetMapping("/services")
	public Object services() {
		return discoveryClient.getServices();
	}

=======
	@RequestMapping(value = "/services", method = RequestMethod.GET)
	public Object services() {
		return discoveryClient.getServices();
	}
>>>>>>> 1.x
}
