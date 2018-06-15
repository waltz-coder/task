package com.task.cache;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

import org.apache.ibatis.cache.Cache;
import org.apache.log4j.Logger;

public class RedisCache implements Cache
{
	private Logger logger=Logger.getLogger(RedisCache.class);
	private ReadWriteLock LOCK=new ReentrantReadWriteLock();
//	private Class<RedisCache>LOCK=RedisCache.class;
	private String id;
	private Map<Object,Object> cache=new HashMap<Object,Object>();
	public RedisCache(String id)
	{
		logger.info(id);
		this.id=id;
	}
	@Override
	public void clear()
	{
		// TODO Auto-generated method stub
		cache.clear();
	}

	@Override
	public String getId()
	{
		// TODO Auto-generated method stub
		return this.id;
	}

	@Override
	public Object getObject(Object key)
	{
		// TODO Auto-generated method stub
		
		return cache.get(key);
	}

	@Override
	public ReadWriteLock getReadWriteLock()
	{
		// TODO Auto-generated method stub
		return this.LOCK;
	}

	@Override
	public int getSize()
	{
		// TODO Auto-generated method stub
		return cache.size();
	}

	@Override
	public void putObject(Object key, Object value)
	{
		// TODO Auto-generated method stub
		logger.info(cache.put(key, value));
	}

	@Override
	public Object removeObject(Object key)
	{
		// TODO Auto-generated method stub
		
		return cache.remove(key);
	}
	
}
