package com.gwd.config;

import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;


/** 
* @ProjectName spring-boot
* @author JackHisen(gu.weidong) 
* @Date 2018年2月14日 下午2:55:09    
* @Version 1.0 
* @Description:
*/
@Configuration
public class DataSourceConfig {
	@Bean(name = "primaryDataSource")
    @Qualifier("primaryDataSource")
    @ConfigurationProperties(prefix="spring.datasource.primary")
    public DataSource primaryDataSource() {
		DataSource dataSource = new com.alibaba.druid.pool.DruidDataSource();
        return dataSource;
    }

    @Bean(name = "secondaryDataSource")
    @Qualifier("secondaryDataSource")
    @Primary
    @ConfigurationProperties(prefix="spring.datasource.secondary")
    public DataSource secondaryDataSource() {
    	DataSource dataSource = new com.alibaba.druid.pool.DruidDataSource();
        return dataSource;
    }
    
    @Bean(name = "primaryJdbcTemplate")
	public JdbcTemplate primaryJdbcTemplate(
	        @Qualifier("primaryDataSource") DataSource dataSource) {
	    return new JdbcTemplate(dataSource);
	}

	@Bean(name = "secondaryJdbcTemplate")
	public JdbcTemplate secondaryJdbcTemplate(
	        @Qualifier("secondaryDataSource") DataSource dataSource) {
	    return new JdbcTemplate(dataSource);
	}
}

