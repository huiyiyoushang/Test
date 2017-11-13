package com.xiu.test.dom4j;

import java.io.File;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;

public class TestDom4j {
	public static void main(String[] args) {
		//解析books.xml文件
		//创建SAXReader的对象reader
		SAXReader reader = new SAXReader();
		//通过reader的read()方法加载XML文件,获取Document对象
		try {
			Document document = reader.read(new File("books.xml"));
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
