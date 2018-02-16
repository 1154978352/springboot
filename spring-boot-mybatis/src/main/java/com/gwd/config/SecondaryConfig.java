package com.gwd.config;

import javax.sql.DataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
/** 
* @ProjectName spring-boot-mybatis
* @author JackHisen(gu.weidong) 
* @Date 2018年2月16日 下午10:06:12    
* @Version 1.0 
* @Description:
*/
@Configuration
//扫描 Mapper 接口并容器管理
@MapperScan(basePackages = SecondaryConfig.PACKAGE, sqlSessionFactoryRef = "clusterSqlSessionFactory")
public class SecondaryConfig {

 // 精确到 cluster 目录，以便跟其他数据源隔离
 static final String PACKAGE = "com.gwd.mapper.user";
 static final String MAPPER_LOCATION = "classpath:mapper/user/*.xml";
 @Autowired 
 @Qualifier("secondaryDataSource")
 private DataSource secondaryDataSource;

 @Bean(name = "clusterTransactionManager")
 public DataSourceTransactionManager clusterTransactionManager() {
     return new DataSourceTransactionManager(secondaryDataSource);
 }

 @Bean(name = "clusterSqlSessionFactory")
 public SqlSessionFactory clusterSqlSessionFactory(@Qualifier("secondaryDataSource") DataSource secondaryDataSource)
         throws Exception {
     final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
     sessionFactory.setDataSource(secondaryDataSource);
     sessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver()
             .getResources(SecondaryConfig.MAPPER_LOCATION));
     return sessionFactory.getObject();
 }
}
