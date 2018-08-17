package com.app.models;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class Account {
	@SerializedName("User")
	private String user;
	@SerializedName("Password")
	private String password;
	@SerializedName("SenderId")
	private String senderId;
	@SerializedName("Channel")
	private String channel;
	@SerializedName("DCS")
	private String dcs;
	@SerializedName("Messages")
	private List<Messages> messages;
	
	
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSenderId() {
		return senderId;
	}
	public void setSenderId(String senderId) {
		this.senderId = senderId;
	}
	public String getChannel() {
		return channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}
	public String getDcs() {
		return dcs;
	}
	public void setDcs(String dcs) {
		this.dcs = dcs;
	}
	public List<Messages> getMessages() {
		return messages;
	}
	public void setMessages(List<Messages> messages) {
		this.messages = messages;
	}
	
	
	

}
