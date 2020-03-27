package com.hss.gmall.service.impl;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hss.gmall.service.OrderService;

//222111
public class MainApplication {

	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "consumer.xml" });
		
		OrderService orderService = context.getBean(OrderService.class);
		
		orderService.initOrder("1");
		
		System.out.println("调用结束。");
		System.in.read();
		
		
	}

}
