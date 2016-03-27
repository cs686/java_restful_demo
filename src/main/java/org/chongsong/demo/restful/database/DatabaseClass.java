package org.chongsong.demo.restful.database;

import java.util.HashMap;
import java.util.Map;

import org.chongsong.demo.restful.model.Message;
import org.chongsong.demo.restful.model.Profile;

public class DatabaseClass {
	private static Map<Long,Message> message = new HashMap<>();
	private static Map<Long,Profile> profile = new HashMap<>();
	
	
	public static Map<Long,Message> getMessage(){
		return message;
	}
	
	public static Map<Long,Profile> getProfile(){
		return profile;
	}
	
	
	
}
