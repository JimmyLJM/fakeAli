package com.jimmy.springBootDemo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * author : jimmyLJM on 2017-09-09
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class RedisTest {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Test
    public void demo(){
        stringRedisTemplate.opsForValue().set("expect","redisTest");

        System.out.println(stringRedisTemplate.opsForValue().get("expect"));
    }
}
