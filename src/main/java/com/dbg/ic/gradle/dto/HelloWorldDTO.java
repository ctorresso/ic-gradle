package com.dbg.ic.gradle.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class HelloWorldDTO implements Serializable {

	private static final long serialVersionUID = 8965604659618066827L;

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
