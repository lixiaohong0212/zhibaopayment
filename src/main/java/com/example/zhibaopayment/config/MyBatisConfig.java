package com.example.zhibaopayment.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author lee
 * @create 2023-03-21 4:00 PM
 */

@MapperScan("com.example.zhibaopayment.mapper")
@EnableTransactionManagement
@Configuration
public class MyBatisConfig {

}
