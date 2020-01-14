package com.algorithm.springboot.handler;

import javax.persistence.Entity;

@Entity
public class ResultEntity {

	private int code;
	private String response;

	public ResultEntity(int code, String response) {
		this.code = code;
		this.response = response;
	}

	public int getCode() {
		return this.code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getResponse() {
		return this.response;
	}

	public void setResponse(String response) {
		this.response = response;
	}
}
