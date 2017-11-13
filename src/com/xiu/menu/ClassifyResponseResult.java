package com.xiu.menu;

import java.util.List;

public class ClassifyResponseResult {
	private String status;
	private String msg;
	private List<ClassifyList> result;
	
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public List<ClassifyList> getResult() {
		return result;
	}
	public void setResult(List<ClassifyList> result) {
		this.result = result;
	}
}
