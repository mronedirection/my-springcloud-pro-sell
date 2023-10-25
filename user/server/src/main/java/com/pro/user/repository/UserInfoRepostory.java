package com.pro.user.repository;

import com.pro.user.dataobject.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 */
public interface UserInfoRepostory extends JpaRepository<UserInfo, String> {

	UserInfo findByOpenid(String openid);
}
