package com.xiu.weather;

import java.util.List;

public class CityResult {
	private String status;
	private String msg;
	private List<City> result;
	
	
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
	public List<City> getResult() {
		return result;
	}
	public void setResult(List<City> result) {
		this.result = result;
	}
}
