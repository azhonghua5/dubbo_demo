package com.hss.gmall.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hss.gmall.bean.UserAddress;
import com.hss.gmall.service.OrderService;
import com.hss.gmall.service.UserService;

@Service
public class OrderServiceImpl implements OrderService{

	@Autowired
	UserService userService;
	
	public void initOrder(String userId) {
		// TODO Auto-generated method stub
		
		System.out.println("userId: " + userId);
		//1. 查询用户收货地址
		List<UserAddress> userAddressList = userService.getUserAddressList(userId);
		for (UserAddress userAddress : userAddressList) {
			System.out.println(userAddress.getUserAddress());
		}
		System.out.println(userAddressList);
		
		
		
	}

}
