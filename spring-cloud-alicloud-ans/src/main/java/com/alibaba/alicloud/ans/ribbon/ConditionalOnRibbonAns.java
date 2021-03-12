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

<<<<<<< HEAD:spring-cloud-alibaba-starters/spring-cloud-starter-alibaba-nacos-discovery/src/main/java/com/alibaba/cloud/nacos/ConditionalOnNacosDiscoveryEnabled.java
package com.alibaba.cloud.nacos;
=======
package com.alibaba.alicloud.ans.ribbon;
>>>>>>> 1.x:spring-cloud-alicloud-ans/src/main/java/com/alibaba/alicloud/ans/ribbon/ConditionalOnRibbonAns.java

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;

<<<<<<< HEAD:spring-cloud-alibaba-starters/spring-cloud-starter-alibaba-nacos-discovery/src/main/java/com/alibaba/cloud/nacos/ConditionalOnNacosDiscoveryEnabled.java
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.TYPE, ElementType.METHOD })
@ConditionalOnProperty(value = "spring.cloud.nacos.discovery.enabled",
		matchIfMissing = true)
public @interface ConditionalOnNacosDiscoveryEnabled {
=======
/**
 * @author xiaolongzuo
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.TYPE, ElementType.METHOD })
@ConditionalOnProperty(value = "ribbon.ans.enabled", matchIfMissing = true)
public @interface ConditionalOnRibbonAns {
>>>>>>> 1.x:spring-cloud-alicloud-ans/src/main/java/com/alibaba/alicloud/ans/ribbon/ConditionalOnRibbonAns.java

}
