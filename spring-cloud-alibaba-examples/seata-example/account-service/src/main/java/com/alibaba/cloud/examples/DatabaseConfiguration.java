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
<<<<<<< HEAD

package com.alibaba.cloud.examples;

import javax.sql.DataSource;

import com.alibaba.druid.pool.DruidDataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
=======
package com.alibaba.cloud.examples;

import java.sql.SQLException;

import com.alibaba.druid.pool.DruidDataSource;

import io.seata.rm.datasource.DataSourceProxy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.env.Environment;
>>>>>>> 1.x
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @author xiaojing
 */
@Configuration
public class DatabaseConfiguration {

<<<<<<< HEAD
	@Bean
	@Primary
	@ConfigurationProperties("spring.datasource")
	public DataSource storageDataSource() {
		return new DruidDataSource();
	}

	@Bean
	public JdbcTemplate jdbcTemplate(DataSource dataSource) {
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
=======
	private final ApplicationContext applicationContext;

	public DatabaseConfiguration(ApplicationContext applicationContext) {
		this.applicationContext = applicationContext;
	}

	@Bean(initMethod = "init", destroyMethod = "close")
	@Primary
	public DruidDataSource druidDataSource() throws SQLException {

		Environment environment = applicationContext.getEnvironment();

		String ip = environment.getProperty("mysql.server.ip");
		String port = environment.getProperty("mysql.server.port");
		String dbName = environment.getProperty("mysql.db.name");

		String userName = environment.getProperty("mysql.user.name");
		String password = environment.getProperty("mysql.user.password");

		DruidDataSource druidDataSource = new DruidDataSource();
		druidDataSource.setUrl(
				"jdbc:mysql://" + ip + ":" + port + "/" + dbName + "?serverTimezone=UTC");
		druidDataSource.setUsername(userName);
		druidDataSource.setPassword(password);
		druidDataSource.setDriverClassName("com.mysql.jdbc.Driver");
		druidDataSource.setInitialSize(0);
		druidDataSource.setMaxActive(180);
		druidDataSource.setMaxWait(60000);
		druidDataSource.setMinIdle(0);
		druidDataSource.setValidationQuery("Select  'x' from DUAL");
		druidDataSource.setTestOnBorrow(false);
		druidDataSource.setTestOnReturn(false);
		druidDataSource.setTestWhileIdle(true);
		druidDataSource.setTimeBetweenEvictionRunsMillis(60000);
		druidDataSource.setMinEvictableIdleTimeMillis(25200000);
		druidDataSource.setRemoveAbandoned(true);
		druidDataSource.setRemoveAbandonedTimeout(1800);
		druidDataSource.setLogAbandoned(true);
		druidDataSource.setFilters("mergeStat");
		return druidDataSource;
	}

	@Bean
	public DataSourceProxy dataSourceProxy(DruidDataSource druidDataSource) {
		return new DataSourceProxy(druidDataSource);
	}

	@Bean
	public JdbcTemplate jdbcTemplate(DataSourceProxy dataSourceProxy) {
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSourceProxy);
>>>>>>> 1.x

		jdbcTemplate.update("delete from account_tbl where user_id = 'U100001'");
		jdbcTemplate.update(
				"insert into account_tbl(user_id, money) values ('U100001', 10000)");

		return jdbcTemplate;
	}

}
