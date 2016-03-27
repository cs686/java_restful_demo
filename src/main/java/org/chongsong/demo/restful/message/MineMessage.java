package org.chongsong.demo.restful.message;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.chongsong.demo.restful.model.Message;
import org.chongsong.demo.restful.service.MessageServer;

@Path("/message")

public class MineMessage {
	
	MessageServer messageServer = new MessageServer();
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	 
	 public List<Message> getMessage(){
		 return messageServer.getAllMessage();
	 }
	 
	
}
