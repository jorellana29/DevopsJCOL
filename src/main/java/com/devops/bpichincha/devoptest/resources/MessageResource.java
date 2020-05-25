package com.devops.bpichincha.devoptest.resources;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.devops.bpichincha.devoptest.logic.ProcessMessage;
import com.devops.bpichincha.devoptest.models.MessageIn;
import com.devops.bpichincha.devoptest.models.MessageOut;

@RestController
@RequestMapping(value = "/DevOps")
public class MessageResource {
	
	@RequestMapping(method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE,
			consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<MessageOut> sendMessageToUser(@RequestBody MessageIn messageIn){
		
		ProcessMessage process = new ProcessMessage();
		MessageOut messageOut = process.processMessage(messageIn);
		return new ResponseEntity<MessageOut>(messageOut,HttpStatus.OK);
	}
}
