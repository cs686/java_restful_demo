package org.chongsong.demo.restful.model;

import java.util.Date;

public class Profile {
	
	private long id;
	private String firstName;
	private String lastName;
	private Date created;
	
	public Profile(){
		
	}
	
	public Profile(long id, String firstName, String lastName, Date created) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.created = created;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	
	
	
}
