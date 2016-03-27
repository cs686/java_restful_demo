package org.chongsong.demo.restful.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement


public class Message {
	private long id;
	private String name;
	private Date create;
	private String auhtor;
	
	
	public Message(){
		
	}
	
	public Message(long id, String name, Date create, String auhtor) {
		super();
		this.id = id;
		this.name = name;
		this.create = create;
		this.auhtor = auhtor;
		
		
	}
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getCreate() {
		return create;
	}
	public void setCreate(Date create) {
		this.create = create;
	}
	public String getAuhtor() {
		return auhtor;
	}
	public void setAuhtor(String auhtor) {
		this.auhtor = auhtor;
	}
	
	
	
}
