package com.tx.javaConfig;


import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan({"com.tx.dao"})
@PropertySource("db.properties")
@EnableTransactionManagement
public class PresistacyConfig {
	
	@Autowired
	private Environment env;	
	
	@Bean(name="dataSource")
	public DataSource newDataSource() {
		DataSource dataSource = null;
		dataSource =(DataSource) new DriverManagerDataSource(env.getProperty("url"), env.getProperty("user"),
				env.getProperty("password"));
		return dataSource;
	}
	
	@Bean(name="transactionManager",autowire=Autowire.BY_TYPE)
	public PlatformTransactionManager newPlatformTransactionManager() {
		PlatformTransactionManager transactionManager = null;
		transactionManager =new DataSourceTransactionManager();
		return transactionManager;
	}
	@Bean(name="namedParameterJdbcTemplate",autowire=Autowire.BY_TYPE)
   	public NamedParameterJdbcTemplate newNamedParameterJdbcTemplate(){
		NamedParameterJdbcTemplate namedParameterJdbcTemplate=null;
		namedParameterJdbcTemplate=new NamedParameterJdbcTemplate((javax.sql.DataSource) newDataSource());
		return namedParameterJdbcTemplate;
	}
	
	/*@Bean(name="jdbcTemplate",autowire=Autowire.BY_TYPE)
   	public JdbcTemplate newNamedParameterJdbcTemplate(){
		JdbcTemplate jdbcTemplate=null;
		jdbcTemplate=new JdbcTemplate();
		return jdbcTemplate;
	}*/
	
}
