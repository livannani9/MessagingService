package com.app.models;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class Responces {
	
	@SerializedName("ErrorCode")
	private int errorCode;
	
	@SerializedName("ErrorMessage")
	private String errorMessage;
	
	@SerializedName("JobId")
	private int jobId;
	
	@SerializedName("Number")
	private Integer number;
	
	@SerializedName("MessageId")
	private Integer messageId;
	
	@SerializedName("MessageData")
	private List<MessageData> messageData;

	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public int getJobId() {
		return jobId;
	}

	public void setJobId(int jobId) {
		this.jobId = jobId;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Integer getMessageId() {
		return messageId;
	}

	public void setMessageId(Integer messageId) {
		this.messageId = messageId;
	}

	public List<MessageData> getMessageData() {
		return messageData;
	}

	public void setMessageData(List<MessageData> messageData) {
		this.messageData = messageData;
	}
	
	
}

