package com.pro.user.service;


import com.pro.user.dataobject.UserInfo;

/**
 */
public interface UserService {

	/**
	 * 通过openid来查询用户信息
	 * @param openid
	 * @return
	 */
	UserInfo findByOpenid(String openid);
}
