package com.example.testconnectmysql;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.sql.ResultSet;
import java.sql.SQLException;

@RestController
@RequestMapping("/test")
public class TestController {

    @Resource
    private JdbcTemplate jdbcTemplate;

    @RequestMapping("/hello")
    public String helloWorld() {
        return "Hello Kapok!";
    }

    @RequestMapping("/count")
    public Long count() {
        return jdbcTemplate.query("select count(*) from help_keyword", rs -> {
            rs.next();
            return rs.getLong(1);
        });
    }
}
