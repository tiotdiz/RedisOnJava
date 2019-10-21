package com.qps.queue;

import java.util.List;

import redis.clients.jedis.Jedis;

public class RedisConsumer {
	/**
	 * 使用jedis操作list
	 */
	public static void main(String[] args) {
		ScheduleMQ smq = new ScheduleMQ();
		smq.start();
	}
}

class ScheduleMQ extends Thread {
	@Override
	public void run() {
		while (true) {
			String host = "localhost";
			int port = 6379;
			Jedis jedis = new Jedis(host, port);
			// 阻塞式brpop，无数据时阻塞
			// 参数为0一直阻塞，直到有数据
			List<String> list = jedis.brpop(0, "informList");
			for (String s : list) {
				System.out.println(s);
			}
			jedis.close();
		}
	}
}
