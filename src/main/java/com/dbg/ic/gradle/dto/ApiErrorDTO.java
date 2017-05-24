package com.dbg.ic.gradle.dto;

public class ApiErrorDTO {

	private String error;

	public ApiErrorDTO(String error) {
		super();
		this.error = error;
	}

	public ApiErrorDTO() {
		super();
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

}
