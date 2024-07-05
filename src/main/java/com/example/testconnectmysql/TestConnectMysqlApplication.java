package com.example.testconnectmysql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Jul 5th, 2024:
 * This application acts as the service provider of feign client which is the test-mysql-2 project.
 */
@SpringBootApplication
public class TestConnectMysqlApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestConnectMysqlApplication.class, args);
    }

}
