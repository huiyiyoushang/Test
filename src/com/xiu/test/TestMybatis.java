package com.xiu.test;

import java.io.IOException;

import org.apache.ibatis.session.SqlSession;

import com.xiu.dao.User;
import com.xiu.util.Mybatis;

public class TestMybatis {
	public static void main(String[] args) { 
		SqlSession session = null;
		try {
			session = Mybatis.getSqlSessionFactory().openSession(true);
			User user = session.selectOne("UserMapper.selectUserByID", 52);
			System.out.println(user.getAccount());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
