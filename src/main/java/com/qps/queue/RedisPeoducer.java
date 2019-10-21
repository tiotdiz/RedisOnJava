package com.qps.queue;

import com.qps.utils.RedisUtil;

public class RedisPeoducer {
	/**
	 * 使用jedis操作list
	 */
	public static void main(String[] args) {
		String host = "localhost";
		int port = 6379;
		RedisUtil redisUtil = new RedisUtil(host, port);
		
		for (int i = 0; i < 10; i++) {
			redisUtil.getJedis().lpush("informList", "value" + i);
		}
		redisUtil.getJedis().close();
	}
}
