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

package com.alibaba.cloud.examples;
<<<<<<< HEAD
<<<<<<< HEAD:spring-cloud-alibaba-examples/sentinel-example/sentinel-dubbo-example/sentinel-dubbo-api/src/main/java/com/alibaba/cloud/examples/FooService.java
=======
>>>>>>> 1.x

/**
 * @author fangjian
 */
public interface FooService {

	String hello(String name);

<<<<<<< HEAD
=======

import org.springframework.stereotype.Service;

/**
 * @author xiaolongzuo
 */
@Service
public class TestService {

	public void test() {
		TestController.atomicInteger.incrementAndGet();
	}
>>>>>>> 1.x:spring-cloud-alibaba-examples/schedulerx-example/schedulerx-simple-task-example/src/main/java/com/alibaba/cloud/examples/TestService.java
=======
>>>>>>> 1.x
}
