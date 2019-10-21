package com.qps.utils;

import redis.clients.jedis.Jedis;

public class RedisUtil {
	private Jedis jedis;
		
	public RedisUtil(String host, int port) {
		jedis = new Jedis(host, port);
	}
	
	public Jedis getJedis() {
		return jedis;
	}

	public void setJedis(Jedis jedis) {
		this.jedis = jedis;
	}


	public void setKV(String key, String value){
		jedis.set(key, value);
	}
	
	public String getV(String key) {
		return jedis.get(key);
	}
}
