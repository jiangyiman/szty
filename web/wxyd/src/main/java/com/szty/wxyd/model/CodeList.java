package com.szty.wxyd.model;

import java.util.List;

public class CodeList extends ReqModel {

	private String device_num;
	private List<Cqrcode> code_list;

	public String getDevice_num() {
		return device_num;
	}

	public void setDevice_num(String device_num) {
		this.device_num = device_num;
	}

	public List<Cqrcode> getCode_list() {
		return code_list;
	}

	public void setCode_list(List<Cqrcode> code_list) {
		this.code_list = code_list;
	}

}
