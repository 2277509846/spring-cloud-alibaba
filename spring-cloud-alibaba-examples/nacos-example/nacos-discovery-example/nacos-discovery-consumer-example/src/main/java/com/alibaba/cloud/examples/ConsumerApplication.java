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
import com.alibaba.cloud.sentinel.annotation.SentinelRestTemplate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
<<<<<<< HEAD
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
=======
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
>>>>>>> 1.x
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

/**
 * @author xiaojing
 */
@SpringBootApplication
<<<<<<< HEAD
@EnableDiscoveryClient(autoRegister = true)
=======
@EnableDiscoveryClient
>>>>>>> 1.x
@EnableFeignClients
public class ConsumerApplication {

	@LoadBalanced
	@Bean
	@SentinelRestTemplate(urlCleanerClass = UrlCleaner.class, urlCleaner = "clean")
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

	@LoadBalanced
	@Bean
	@SentinelRestTemplate
	public RestTemplate restTemplate1() {
		return new RestTemplate();
	}

	public static void main(String[] args) {
		SpringApplication.run(ConsumerApplication.class, args);
	}

<<<<<<< HEAD
	@FeignClient(name = "service-provider", fallback = EchoServiceFallback.class,
			configuration = FeignConfiguration.class)
	public interface EchoService {

		@GetMapping("/echo/{str}")
		String echo(@PathVariable("str") String str);

		@GetMapping("/divide")
		String divide(@RequestParam("a") Integer a, @RequestParam("b") Integer b);

		default String divide(Integer a) {
			return divide(a, 0);
		}

		@GetMapping("/notFound")
		String notFound();

=======
	@FeignClient(name = "service-provider-1X", fallback = EchoServiceFallback.class, configuration = FeignConfiguration.class)
	public interface EchoService {
		@RequestMapping(value = "/echo/{str}", method = RequestMethod.GET)
		String echo(@PathVariable("str") String str);

		@RequestMapping(value = "/divide", method = RequestMethod.GET)
		String divide(@RequestParam("a") Integer a, @RequestParam("b") Integer b);

		@RequestMapping(value = "/notFound", method = RequestMethod.GET)
		String notFound();
>>>>>>> 1.x
	}

}

class FeignConfiguration {
<<<<<<< HEAD

=======
>>>>>>> 1.x
	@Bean
	public EchoServiceFallback echoServiceFallback() {
		return new EchoServiceFallback();
	}
<<<<<<< HEAD

}

class EchoServiceFallback implements EchoService {

=======
}

class EchoServiceFallback implements EchoService {
>>>>>>> 1.x
	@Override
	public String echo(@PathVariable("str") String str) {
		return "echo fallback";
	}

	@Override
	public String divide(@RequestParam Integer a, @RequestParam Integer b) {
		return "divide fallback";
	}

	@Override
	public String notFound() {
		return "notFound fallback";
	}
<<<<<<< HEAD

=======
>>>>>>> 1.x
}
