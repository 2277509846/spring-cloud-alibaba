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

<<<<<<< HEAD
<<<<<<< HEAD:spring-cloud-alibaba-examples/seata-example/account-service/src/main/java/com/alibaba/cloud/examples/AccountApplication.java
=======
>>>>>>> 1.x
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author xiaojing
 */
@SpringBootApplication
public class AccountApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountApplication.class, args);
	}
<<<<<<< HEAD
=======
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author xiaolongzuo
 */
@FeignClient(value = "ans-provider")
public interface EchoService {

	@RequestMapping(path = "echo/{str}")
	String echo(@RequestParam("str") String param);
>>>>>>> 1.x:spring-cloud-alibaba-examples/ans-example/ans-consumer-feign-example/src/main/java/com/alibaba/cloud/examples/EchoService.java
=======
>>>>>>> 1.x

}
