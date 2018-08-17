package com.app.models;

import com.google.gson.annotations.SerializedName;

public class MessageData {
	
	@SerializedName("Number")
	private String number;
	@SerializedName("MessageId")
	private String messageId;
	@SerializedName("Message")
	private String message;

	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getMessageId() {
		return messageId;
	}
	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

	
}
