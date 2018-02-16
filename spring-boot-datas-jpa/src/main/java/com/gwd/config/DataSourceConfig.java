package com.gwd.config;

import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
/** 
* @ProjectName spring-boot-datas-jpa
* @author JackHisen(gu.weidong) 
* @Date 2018年2月16日 下午1:49:13    
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

}

