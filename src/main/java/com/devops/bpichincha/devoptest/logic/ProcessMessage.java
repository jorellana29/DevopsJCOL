package com.devops.bpichincha.devoptest.logic;

import com.devops.bpichincha.devoptest.models.MessageIn;
import com.devops.bpichincha.devoptest.models.MessageOut;
import com.google.common.base.Strings;

public class ProcessMessage {

	public MessageOut processMessage(MessageIn message) {
		
		MessageOut messOut = null;	
		try {
			
			messOut = new MessageOut();
			if(!Strings.isNullOrEmpty(message.getToPerson()))
				messOut.setMessage("Hello " + message.getToPerson() + " your message will be send.");
			else
				messOut.setMessage("The sender is null or empty");
			
		} catch (NullPointerException e) {
			
			messOut = new MessageOut();
			messOut.setMessage("Error, su mensaje es nulo");
		}
		
		return messOut;
	}
}
