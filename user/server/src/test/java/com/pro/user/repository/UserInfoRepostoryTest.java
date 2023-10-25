package com.pro.user.repository;

import com.pro.user.UserApplication;
import com.pro.user.dataobject.UserInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Component;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @author RenHao
 * @create 2023-09-19 14:20
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class UserInfoRepostoryTest {

    @Autowired
    private UserInfoRepostory userInfoRepostory;

    @Test
    public void findByOpenid() {
        UserInfo userInfo = userInfoRepostory.findByOpenid("abc");
        Assert.assertNotNull(userInfo);
    }
}