package com.cupacm.oj.service.config.db;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import com.google.gson.Gson;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
@MapperScan(basePackages = "com.cupacm.oj.dao")
@Slf4j
public class MybatisConfiguration {
    @Autowired
    private DatabaseConfiguration databaseConfiguration;

    @Bean
    public DataSource dataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(databaseConfiguration.getConfig("driver_class_name"));
        dataSource.setUrl(databaseConfiguration.getConfig("url"));
        dataSource.setUsername(databaseConfiguration.getConfig("username"));
        dataSource.setPassword(databaseConfiguration.getConfig("password"));
        dataSource.setMinIdle(10);
        dataSource.setMaxActive(50);
        dataSource.setInitialSize(10);
        log.info("dataSource: {}", new Gson().toJson(databaseConfiguration.getConfig("database")));
        return dataSource;
    }

    @Bean
    public ServletRegistrationBean<?> registrationBean() {
        ServletRegistrationBean<StatViewServlet> bean = new ServletRegistrationBean<>(new StatViewServlet(), "/druid/*");
        bean.addInitParameter("loginUsername", "admin");
        bean.addInitParameter("loginPassword", "admin");
        bean.addInitParameter("resetEnable", "false");
        return bean;
    }

    @Bean
    public FilterRegistrationBean<?> druidStatFilter() {
        FilterRegistrationBean<WebStatFilter> bean = new FilterRegistrationBean<>(new WebStatFilter());
        bean.addUrlPatterns("/*");
        bean.addInitParameter("exclusions","*.js,*.gif,*.jpg,*.png,*.css,*.ico,/druid/*");
        return bean;
    }

    @Bean
    public SqlSessionFactory sqlSessionFactory() throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource());
        return sqlSessionFactoryBean.getObject();
    }
}
