package com.app.models;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;

public class SmsRequest {
	
	@SerializedName("Account")
	private Account account;
	@SerializedName("Messages")
	private List<Messages> messages;
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	public List<Messages> getMessages() {
		return messages;
	}
	public void setMessages(List<Messages> messages) {
		this.messages = messages;
	}
	
	public Account prepareAccount(){
		Account account = new Account();
		account.setUser("livan");
		account.setPassword("sms@123");
		account.setChannel("0");
		account.setDcs("0");
		account.setSenderId("TESTIN");
		
		
		return account;
		
	}
	public List<Messages> prepareMessegeList(String number,String text){
		String [] numbers=number.split(",");
		List<Messages> messageList=new ArrayList<Messages>();
		for (String num : numbers) {
				Messages messages=new Messages();
				messages.setNumber(num);
				messages.setText(text);
				messageList.add(messages);
		}
		return messageList;
	}
	
	

	

}
