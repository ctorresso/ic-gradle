package com.dbg.ic.gradle.dto;

public class HelloWorldDTO {

	private String language;
	private String text;

	public HelloWorldDTO() {
		super();
	}

	public HelloWorldDTO(String language, String text) {
		super();
		this.language = language;
		this.text = text;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

}
