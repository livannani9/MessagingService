package com.app.messagingresource;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.app.models.SmsRequest;
import com.google.gson.Gson;

@Path("/messaging")
public class Messaging {
	
	@POST
	@Path("/sendsms")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response sendSms(@QueryParam("mobile") String mobile,@QueryParam("sms") String sms) {
		
		StringBuffer url=new StringBuffer();
		url.append("https://www.smsgatewayhub.com/api/mt/SendSMS");
		
		SmsRequest request=new SmsRequest();
		request.setAccount(request.prepareAccount());
		request.setMessages(request.prepareMessegeList(mobile, sms));
		Gson gson=new Gson();
		
		String jsonRequest = gson.toJson(request);
		
		RestTemplate template=new RestTemplate();
		HttpHeaders headers=new HttpHeaders();

		headers.setContentType(org.springframework.http.MediaType.APPLICATION_JSON);
		HttpEntity entity=new HttpEntity(jsonRequest,headers);

		ResponseEntity<String> responce = template.exchange(url.toString(), HttpMethod.POST, entity,String.class);
		String resultbody = responce.getBody();
		
		
		return Response.status(200).entity("Reslut= "+resultbody).build();
	}

	
}
