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
import org.springframework.boot.WebApplicationType;
=======
>>>>>>> 1.x
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * @author fangjian
 */
@SpringBootApplication
public class SentinelDubboProviderApp {

	public static void main(String[] args) {
		SpringApplicationBuilder providerBuilder = new SpringApplicationBuilder();
<<<<<<< HEAD
		providerBuilder.web(WebApplicationType.NONE)
				.sources(SentinelDubboProviderApp.class).run(args);
=======
		providerBuilder.web(false).sources(SentinelDubboProviderApp.class).run(args);
>>>>>>> 1.x
	}

}
