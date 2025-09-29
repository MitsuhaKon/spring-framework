package org.springframework.mitsuha.test;

import org.springframework.mitsuha.UserService;
import org.springframework.mitsuha.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created on 2025/09/28
 *
 * @author ylm
 */
public class TestMain {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(AppConfig.class);
		context.refresh();
		UserService userService  = (UserService )context.getBean("userServiceImpl");
		userService.queryUser();
	}
}
