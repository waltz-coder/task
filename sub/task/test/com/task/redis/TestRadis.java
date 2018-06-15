package com.task.redis;

import redis.clients.jedis.Jedis;

public class TestRadis
{
	public static void main(String []args)
	{
		Jedis jedis=new Jedis("127.0.0.1", 6379,100000);
		int i=0;
		try
		{
			
		//	long begin=System.currentTimeMillis(),end=0;
		
				jedis.set("test"+i,"i");
		}
		finally
		{
			jedis.close();
		}
		System.out.println(i);
	}
}
