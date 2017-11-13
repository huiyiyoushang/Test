package com.xiu.menu;

import java.util.List;

public class ClassifyList {
	private String classid;
	private String name;
	private String parentid;
	private List<Classify> list;
	
	
	public String getClassid() {
		return classid;
	}
	public void setClassid(String classid) {
		this.classid = classid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getParentid() {
		return parentid;
	}
	public void setParentid(String parentid) {
		this.parentid = parentid;
	}
	public List<Classify> getList() {
		return list;
	}
	public void setList(List<Classify> list) {
		this.list = list;
	}
	
}
