package com.task.entity;

import sun.security.provider.MD5;
import org.springframework.util.DigestUtils;
public class GenneMD5
{
	public static void main(String []args)
	{
		System.out.print(DigestUtils.md5DigestAsHex(new String("zengmenghe@gmail.com#5513").getBytes()));
	}
}
