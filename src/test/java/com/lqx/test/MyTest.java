package com.lqx.test;

import com.lqx.sandm.DemoApplication;
import com.lqx.sandm.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class)
public class MyTest {

    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    public void fun(){
        User user = new User();
        user.setUser_id(100);
        user.setUser_name("张三");
        user.setUser_password("123456");
        user.setUser_code("4567");
        user.setUser_state("1");
        redisTemplate.opsForValue().set("User",user);
    }

    @Test
    public void fun1(){
        User user = (User) redisTemplate.opsForValue().get("User");
        System.out.println(user);
    }
}
