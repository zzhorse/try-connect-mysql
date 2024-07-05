package com.example.testconnectmysql;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/test")
public class TestController {

    @Resource
    private JdbcTemplate jdbcTemplate;

    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello Kapok!";
    }

    @GetMapping("/count")
    public Long count() {
        return jdbcTemplate.query("select count(*) from help_keyword", rs -> {
            rs.next();
            return rs.getLong(1);
        });
    }
}
