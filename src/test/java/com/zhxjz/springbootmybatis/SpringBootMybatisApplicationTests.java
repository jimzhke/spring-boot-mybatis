package com.zhxjz.springbootmybatis;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootMybatisApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Autowired
    private DataSource dataSource;

    @Test
    public void testDataSource() {
        System.out.println(dataSource);
    }


}
