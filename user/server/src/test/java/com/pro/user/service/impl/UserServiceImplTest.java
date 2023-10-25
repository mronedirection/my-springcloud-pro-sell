package com.pro.user.service.impl;

import com.netflix.discovery.converters.Auto;
import com.pro.user.dataobject.UserInfo;
import com.pro.user.service.UserService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @author RenHao
 * @create 2023-09-19 14:27
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceImplTest {

    @Autowired
    private UserService userService;

    @Test
    public void findByOpenid() {
        UserInfo userInfo = userService.findByOpenid("abc");
        Assert.assertNotNull(userInfo);
    }
}