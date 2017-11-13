package com.xiu.menu;

public class ClassifyResponse {
	private String code;
	private String charge;
	private String msg;
	private ClassifyResponseResult result;
	
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getCharge() {
		return charge;
	}
	public void setCharge(String charge) {
		this.charge = charge;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public ClassifyResponseResult getResult() {
		return result;
	}
	public void setResult(ClassifyResponseResult result) {
		this.result = result;
	}
}
