package com.app.models;

import com.google.gson.annotations.SerializedName;

public class Messages {
	@SerializedName("Number")
	private String number;
	@SerializedName("Text")
	private String text;
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}

	
}
