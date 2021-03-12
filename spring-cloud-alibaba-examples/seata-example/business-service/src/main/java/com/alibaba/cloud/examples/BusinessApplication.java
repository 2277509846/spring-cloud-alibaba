/*
<<<<<<< HEAD
 * Copyright 2013-2018 the original author or authors.
=======
 * Copyright (C) 2019 the original author or authors.
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

package com.alibaba.cloud.examples;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
<<<<<<< HEAD
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
=======
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
>>>>>>> 1.x
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

/**
 * @author xiaojing
 */
@SpringBootApplication
@EnableFeignClients
<<<<<<< HEAD
@EnableDiscoveryClient(autoRegister = false)
=======
>>>>>>> 1.x
public class BusinessApplication {

	public static void main(String[] args) {
		SpringApplication.run(BusinessApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

<<<<<<< HEAD
	@FeignClient("storage-service")
	public interface StorageService {

		@GetMapping(path = "/storage/{commodityCode}/{count}")
		String storage(@PathVariable("commodityCode") String commodityCode,
				@PathVariable("count") int count);

	}

	@FeignClient("order-service")
	public interface OrderService {

		@PostMapping(path = "/order")
=======
	@FeignClient(value = "storage", url = "http://127.0.0.1:18082")
	public interface StorageService {

		@RequestMapping(path = "/storage/{commodityCode}/{count}")
		String storage(@RequestParam("commodityCode") String commodityCode,
				@RequestParam("count") int count);

	}

	@FeignClient(value = "order", url = "http://127.0.0.1:18083")
	public interface OrderService {

		@RequestMapping(path = "/order", method = RequestMethod.POST)
>>>>>>> 1.x
		String order(@RequestParam("userId") String userId,
				@RequestParam("commodityCode") String commodityCode,
				@RequestParam("orderCount") int orderCount);

	}
<<<<<<< HEAD

=======
>>>>>>> 1.x
}
