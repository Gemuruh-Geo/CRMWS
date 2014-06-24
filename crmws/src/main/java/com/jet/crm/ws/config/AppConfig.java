package com.jet.crm.ws.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.jet.crm.ws.dao.CallConversionTrackerDao;
import com.jet.crm.ws.dao.CallConversionTrackerDaoImpl;
import com.jet.crm.ws.dao.CallConversionWTDao;
import com.jet.crm.ws.dao.CallConversionWTDaoImpl;
//import com.jet.crm.ws.service.CallConversionCTService;
//import com.jet.crm.ws.service.CallConversionCTServiceImpl;
import com.jet.crm.ws.service.CallConversionCTService;
import com.jet.crm.ws.service.CallConversionCTServiceImpl;
import com.jet.crm.ws.service.CallConversionWTService;
import com.jet.crm.ws.service.CallConversionWTServiceImpl;


@Configuration
@Import(value={DatabaseConfig.class,WebAppConfig.class})
@ComponentScan(basePackages={"com.jet.crm.ws"})
public class AppConfig {
		
	@Bean(name={"calltrackerDao"})
	public CallConversionTrackerDao trackerDao(){
		return new CallConversionTrackerDaoImpl();
	}
	
	@Bean(name={"calltrackerServ"})
	public CallConversionCTService trackerService(){
		return new CallConversionCTServiceImpl();
	}
	

	@Bean(name = {"postgreDs"})
	public DataSource postgreDs() {
		final DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("org.postgresql.Driver");
		dataSource.setUrl("jdbc:postgresql://webtracker-hot-backup.clj7jcajflwf.ap-southeast-2.rds.amazonaws.com:5432/dynamic_numbers_tracking_system");
		dataSource.setUsername("dynamic_numbers_tracking_system");
		dataSource.setPassword("d4pj1ifjgi");
        return dataSource;
	}
	
	@Bean(name = {"wtDao"})
	public CallConversionWTDao callConversionWTDao() {
		return new CallConversionWTDaoImpl();
	}
	
	@Bean(name = {"wtService"})
	public CallConversionWTService callConversionWTService() {
		return new CallConversionWTServiceImpl();
	}
}
