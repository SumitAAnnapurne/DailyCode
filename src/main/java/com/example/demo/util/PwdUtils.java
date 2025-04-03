package com.example.demo.util;

import org.apache.commons.lang3.RandomStringUtils;

public class PwdUtils {
	
	public static String generateRandomPwd() {
		//apche common dependency
		String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		@SuppressWarnings("deprecation")
		String pwd = RandomStringUtils.random(6, characters);
		return pwd;
	}

}
