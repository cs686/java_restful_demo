package org.chongsong.demo.restful.service;

import java.util.List;
import java.util.ArrayList;
import org.chongsong.demo.restful.model.Message;

public class MessageServer {
	public List<Message> getAllMessage(){
		Message m1 = new Message(1L,"Hello World",null, "Jim");
		Message m2 = new Message(1L,"Hello Tom",null, "sds");
		List<Message> list = new ArrayList<>();
		list .add(m1);
		list .add(m2);
		return list;
	}
}
