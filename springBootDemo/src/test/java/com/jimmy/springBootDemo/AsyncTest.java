package com.jimmy.springBootDemo;

import com.jimmy.springBootDemo.config.AsyncProvider;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Random;

/**
 * author : jimmyLJM on 2017-09-16
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class AsyncTest {

    @Autowired
    private AsyncProvider asyncProvider;
    @Test
    public void test() throws Exception {
        asyncProvider.doTaskOne();
        asyncProvider.doTaskTwo();
        asyncProvider.doTaskThree();
    }

}
