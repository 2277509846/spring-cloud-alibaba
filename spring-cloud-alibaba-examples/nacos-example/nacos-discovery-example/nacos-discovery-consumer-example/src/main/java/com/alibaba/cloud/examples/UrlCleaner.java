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
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.alibaba.cloud.examples;

public class UrlCleaner {
<<<<<<< HEAD

=======
>>>>>>> 1.x
	public static String clean(String url) {
		System.out.println("enter urlCleaner");
		if (url.matches(".*/echo/.*")) {
			System.out.println("change url");
			url = url.replaceAll("/echo/.*", "/echo/{str}");
		}
		return url;
	}
<<<<<<< HEAD

=======
>>>>>>> 1.x
}
