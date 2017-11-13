package com.xiu.util;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


public class Mybatis {
	//禁止外部创建类的实例
	private Mybatis() {}
	private static final Mybatis mybatis = new Mybatis();
	//创建一个SqlSession的对象
	public static SqlSessionFactory getSqlSessionFactory() throws IOException {
		SqlSessionFactory sqlSessionFactory = null;
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		sqlSessionFactory = mybatis.getSqlSessionFactoryBuilder().build(inputStream);
		return sqlSessionFactory;
	}
	//创建一个SqlSessionFactory的对象
	private SqlSessionFactoryBuilder getSqlSessionFactoryBuilder() throws IOException {
		SqlSessionFactoryBuilder sqlSessionFactoryBuilder = null;
	    sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();	
		return sqlSessionFactoryBuilder;
	}
}
