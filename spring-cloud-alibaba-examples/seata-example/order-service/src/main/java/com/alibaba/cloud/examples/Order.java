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

import java.io.Serializable;

public class Order implements Serializable {
<<<<<<< HEAD

	/**
	 * id.
	 */
	public long id;

	/**
	 * user id.
	 */
	public String userId;

	/**
	 * commodity code.
	 */
	public String commodityCode;

	/**
	 * count.
	 */
	public int count;

	/**
	 * money.
	 */
=======
	public long id;
	public String userId;
	public String commodityCode;
	public int count;
>>>>>>> 1.x
	public int money;

	@Override
	public String toString() {
		return "Order{" + "id=" + id + ", userId='" + userId + '\'' + ", commodityCode='"
				+ commodityCode + '\'' + ", count=" + count + ", money=" + money + '}';
	}
<<<<<<< HEAD

=======
>>>>>>> 1.x
}
