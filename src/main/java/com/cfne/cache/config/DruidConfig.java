package com.cfne.cache.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 配置自定义
 * 数据源连接池
 * @author zmy
 * @version 1.0
 */
@Configuration
public class DruidConfig {

    @ConfigurationProperties(prefix = "spring.datasource")
    @Bean
    public DruidDataSource druid(){

        return new DruidDataSource();
    }
}
