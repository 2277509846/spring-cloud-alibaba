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

import java.io.IOException;
import java.io.StringReader;
<<<<<<< HEAD
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Executor;

import com.alibaba.cloud.nacos.NacosConfigManager;
=======
import java.util.Properties;
import java.util.concurrent.Executor;

import com.alibaba.cloud.nacos.NacosConfigProperties;
>>>>>>> 1.x
import com.alibaba.nacos.api.config.listener.Listener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
<<<<<<< HEAD
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
=======
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;
>>>>>>> 1.x
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xiaojing, Jianwei Mao
 */
@SpringBootApplication
public class Application {
<<<<<<< HEAD

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public UserConfig userConfig() {
		return new UserConfig();
	}

}

@ConfigurationProperties(prefix = "user")
class UserConfig {

	private int age;

	private String name;

	private String hr;

	private Map<String, Object> map;

	private List<User> users;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Map<String, Object> getMap() {
		return map;
	}

	public void setMap(Map<String, Object> map) {
		this.map = map;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public String getHr() {
		return hr;
	}

	public void setHr(String hr) {
		this.hr = hr;
	}

	@Override
	public String toString() {
		return "UserConfig{" + "age=" + age + ", name='" + name + '\'' + ", map=" + map
				+ ", hr='" + hr + '\'' + ", users=" + users + '}';
	}

	public static class User {

		private String name;

		private String hr;

		private String avg;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getHr() {
			return hr;
		}

		public void setHr(String hr) {
			this.hr = hr;
		}

		public String getAvg() {
			return avg;
		}

		public void setAvg(String avg) {
			this.avg = avg;
		}

		@Override
		public String toString() {
			return "User{" + "name='" + name + '\'' + ", hr=" + hr + ", avg=" + avg + '}';
		}

	}

=======
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
>>>>>>> 1.x
}

@Component
class SampleRunner implements ApplicationRunner {

<<<<<<< HEAD
	@Autowired
	private NacosConfigManager nacosConfigManager;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		nacosConfigManager.getConfigService().addListener(
				"nacos-config-custom.properties", "DEFAULT_GROUP", new Listener() {

					/**
					 * Callback with latest config data.
					 * @param configInfo latest config data for specific dataId in Nacos
					 * server
=======
	@Value("${user.name}")
	String userName;

	@Value("${user.age:25}")
	int userAge;

	@Autowired
	private NacosConfigProperties nacosConfigProperties;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println(
				String.format("Initial username=%s, userAge=%d", userName, userAge));

		nacosConfigProperties.configServiceInstance().addListener(
				"nacos-config-example.properties", "DEFAULT_GROUP", new Listener() {

					/**
					 * Callback with latest config data.
					 *
					 * For example, config data in Nacos is:
					 *
					 * user.name=Nacos user.age=25
					 *
					 * @param configInfo latest config data for specific dataId in Nacos
					 *     server
>>>>>>> 1.x
					 */
					@Override
					public void receiveConfigInfo(String configInfo) {
						Properties properties = new Properties();
						try {
							properties.load(new StringReader(configInfo));
						}
						catch (IOException e) {
							e.printStackTrace();
						}
						System.out.println("config changed: " + properties);
					}

					@Override
					public Executor getExecutor() {
						return null;
					}
				});
	}
<<<<<<< HEAD

=======
>>>>>>> 1.x
}

@RestController
@RefreshScope
class SampleController {

<<<<<<< HEAD
	@Autowired
	UserConfig userConfig;

	@Autowired
	private NacosConfigManager nacosConfigManager;

	@Autowired
	private Environment environment;

	@Value("${user.name:zz}")
	String userName;

	@Value("${user.age:25}")
	Integer age;

	@RequestMapping("/user")
	public String simple() {
		return "Hello Nacos Config!" + "Hello " + userName + " " + age + " [UserConfig]: "
				+ userConfig + "!" + nacosConfigManager.getConfigService();
	}

	@RequestMapping("/get/{name}")
	public String getValue(@PathVariable String name) {
		return String.valueOf(environment.getProperty(name));
	}

	@RequestMapping("/bool")
	public boolean bool() {
		return (Boolean) (userConfig.getMap().get("2"));
	}

}
=======
	@Value("${user.name}")
	String userName;

	@Value("${user.age:25}")
	int age;

	@RequestMapping("/user")
	public String simple() {
		return "Hello Nacos Config!" + "Hello " + userName + " " + age + "!";
	}
}
>>>>>>> 1.x
