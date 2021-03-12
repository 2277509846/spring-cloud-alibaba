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

<<<<<<< HEAD:spring-cloud-alibaba-starters/spring-cloud-starter-alibaba-sentinel/src/main/java/com/alibaba/cloud/sentinel/endpoint/SentinelEndpointAutoConfiguration.java
package com.alibaba.cloud.sentinel.endpoint;

import com.alibaba.cloud.sentinel.SentinelProperties;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.boot.actuate.autoconfigure.endpoint.condition.ConditionalOnAvailableEndpoint;
import org.springframework.boot.actuate.autoconfigure.health.ConditionalOnEnabledHealthIndicator;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
=======
package com.alibaba.alicloud.oss.endpoint;

import com.alibaba.alicloud.context.oss.OssProperties;

import org.springframework.boot.actuate.condition.ConditionalOnEnabledEndpoint;
import org.springframework.boot.actuate.endpoint.Endpoint;
>>>>>>> 1.x:spring-cloud-alicloud-oss/src/main/java/com/alibaba/alicloud/oss/endpoint/OssEndpointAutoConfiguration.java
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * OSS {@link Endpoint} Auto-{@link Configuration}
 *
 * @author <a href="mailto:fangjian0423@gmail.com">Jim</a>
 */
@ConditionalOnClass(Endpoint.class)
@EnableConfigurationProperties({ OssProperties.class })
public class OssEndpointAutoConfiguration {

	@Bean
	@ConditionalOnMissingBean
<<<<<<< HEAD:spring-cloud-alibaba-starters/spring-cloud-starter-alibaba-sentinel/src/main/java/com/alibaba/cloud/sentinel/endpoint/SentinelEndpointAutoConfiguration.java
	@ConditionalOnAvailableEndpoint
	public SentinelEndpoint sentinelEndPoint(SentinelProperties sentinelProperties) {
		return new SentinelEndpoint(sentinelProperties);
	}

	@Bean
	@ConditionalOnMissingBean
	@ConditionalOnEnabledHealthIndicator("sentinel")
	public SentinelHealthIndicator sentinelHealthIndicator(
			DefaultListableBeanFactory beanFactory,
			SentinelProperties sentinelProperties) {
		return new SentinelHealthIndicator(beanFactory, sentinelProperties);
=======
	@ConditionalOnEnabledEndpoint("oss")
	public OssEndpoint sentinelEndPoint() {
		return new OssEndpoint();
>>>>>>> 1.x:spring-cloud-alicloud-oss/src/main/java/com/alibaba/alicloud/oss/endpoint/OssEndpointAutoConfiguration.java
	}

}