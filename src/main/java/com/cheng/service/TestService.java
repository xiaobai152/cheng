package com.cheng.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * <h3>springboot-study</h3>
 *
 * @author cheng
 * @description <p>测试异步方法</p>
 * @date 2023-03-27 22:47
 */
@Service
public class TestService {

    @Async
    public void test(){
        try {
            Thread.sleep(3000);
            System.out.println("我是异步方法");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
