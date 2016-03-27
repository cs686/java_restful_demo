package org.chongsong.demo.restful.service;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import org.chongsong.demo.restful.database.DatabaseClass;
import org.chongsong.demo.restful.model.Message;

public class MessageServer {
	
	
	private Map<Long,Message> messages=DatabaseClass.getMessage();
	
	
	public MessageServer(){
		messages.put(1L, new Message(1L,"Hello World",null, "Jim"));
		messages.put(1L, new Message(2L,"Hello Tom",null, "Fucj"));
	}
	
	
	public List<Message> getAllMessage(){
//		Message m1 = new Message(1L,"Hello World",null, "Jim");
//		Message m2 = new Message(1L,"Hello Tom",null, "sds");
//		List<Message> list = new ArrayList<>();
//		list .add(m1);
//		list .add(m2);
//		return list;
		
		return new ArrayList<Message>(messages.values());
		
	}
	
	public Message getMessage(long id){
		return messages.get(id);
	}
	
	public Message addMessage(Message message){
		message.setId(messages.size() + 1);
		messages.put(message.getId(),message);
		return message;
	}
	
	public Message updateMessage(Message message){
		if(message.getId() <= 0){
			return null;
		}
		messages.put(message.getId(), message);
		return message;
	}
	
	public Message removeMessage(long id){
		return messages.remove(id);
	}
	
}
