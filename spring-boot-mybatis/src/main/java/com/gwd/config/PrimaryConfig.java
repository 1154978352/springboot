package com.gwd.config;

import javax.sql.DataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
/** 
* @ProjectName spring-boot-mybatis
* @author JackHisen(gu.weidong) 
* @Date 2018年2月16日 下午9:52:48    
* @Version 1.0 
* @Description:
*/
@Configuration
//扫描 Mapper 接口并容器管理
@MapperScan(basePackages = PrimaryConfig.PACKAGE, sqlSessionFactoryRef = "masterSqlSessionFactory")
public class PrimaryConfig {

 // 精确到 master 目录，以便跟其他数据源隔离
 static final String PACKAGE = "com.gwd.mapper.stu";
 static final String MAPPER_LOCATION = "classpath:mapper/stu/*.xml";

 @Autowired 
 @Qualifier("primaryDataSource")
 private DataSource primaryDataSource;


 @Bean(name = "masterTransactionManager")
 @Primary
 public DataSourceTransactionManager masterTransactionManager() {
     return new DataSourceTransactionManager(primaryDataSource);
 }

 @Bean(name = "masterSqlSessionFactory")
 @Primary
 public SqlSessionFactory masterSqlSessionFactory(@Qualifier("primaryDataSource") DataSource primaryDataSource)
         throws Exception {
     final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
     sessionFactory.setDataSource(primaryDataSource);
     sessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver()
             .getResources(PrimaryConfig.MAPPER_LOCATION));
     return sessionFactory.getObject();
 }
}
