package com.jet.crm.ws.config;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class DatabaseConfig {
	
	private static final String PROPERTY_DATABASE_DRIVER_MY = "db.driver.my";
	private static final String PROPERTY_DATABASE_URL_MY = "db.url.my";
	private static final String PROPERTY_DATABASE_USER_MY ="db.username.my";
	private static final String PROPERTY_DATABASE_PASSWORD_MY = "db.password.my";
	
	private static final String PROPERTY_DATABASE_DRIVER_PG = "db.driver.pg";
	private static final String PROPERTY_DATABASE_URL_PG = "db.url.pg";
	private static final String PROPERTY_DATABASE_USER_PG ="db.username.pg";
	private static final String PROPERTY_DATABASE_PASSWORD_PG = "db.password.pg";
	
	@Resource
	Environment env;
	
	@Bean(name={"mysqlds"})
	public DataSource mySqlDataSource(){
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName(env.getRequiredProperty(PROPERTY_DATABASE_DRIVER_MY));
		dataSource.setUrl(env.getRequiredProperty(PROPERTY_DATABASE_URL_MY));
		dataSource.setUsername(env.getRequiredProperty(PROPERTY_DATABASE_USER_MY));
		dataSource.setPassword(env.getRequiredProperty(PROPERTY_DATABASE_PASSWORD_MY));
		return dataSource;
	}
	@Bean(name={"pgsqlds"})
	public DataSource pgSqlDataSource(){
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName(env.getRequiredProperty(PROPERTY_DATABASE_DRIVER_PG));
		dataSource.setUrl(env.getRequiredProperty(PROPERTY_DATABASE_URL_PG));
		dataSource.setUsername(env.getRequiredProperty(PROPERTY_DATABASE_USER_PG));
		dataSource.setPassword(env.getRequiredProperty(PROPERTY_DATABASE_PASSWORD_PG));
		return dataSource;
	}
	
	
}
