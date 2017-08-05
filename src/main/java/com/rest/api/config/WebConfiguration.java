package com.rest.api.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

/**
 * Created by Dang Dim
 * Date     : 29-Jul-17, 2:14 PM
 * Email    : d.dim@gl-f.com
 */

@EnableAutoConfiguration
@Configuration
@MapperScan("com.rest.api.repositories")
public class WebConfiguration {

    @Autowired
    private Environment environment;

    @Bean
    public DataSource getDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(environment.getProperty("MOL.dataSource.driverClassName"));
        dataSource.setUrl(environment.getProperty("MOL.dataSource.url"));
        dataSource.setUsername(environment.getProperty("MOL.dataSource.username"));
        dataSource.setPassword(environment.getProperty("MOL.dataSource.password"));
        return dataSource;
    }

    @Bean
    public DataSourceTransactionManager transactionManager() {
        return new DataSourceTransactionManager(getDataSource());
    }

    @Bean
    public SqlSessionFactoryBean sqlSessionFactory() throws Exception {
        SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(getDataSource());
        return sessionFactory;
    }

}
