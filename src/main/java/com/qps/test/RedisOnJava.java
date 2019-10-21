package com.qps.test;

import com.qps.utils.RedisUtil;

public class RedisOnJava {
	public static void main(String[] args) {
		String host = "localhost";
		int port = 6379;
		RedisUtil ru = new RedisUtil(host ,port);

		// 创建key-value
		String key = "Redis_key1";
		String value = "Redis_value1";
		ru.setKV(key, value);
//		jedis.set("Redis_key", "Redis_value");
		System.out.println(ru.getV("Redis_key1"));
	}
}
