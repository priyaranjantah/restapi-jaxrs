package org.maven.jersey.messengerprototype.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Message {
	
	private long Id;
	private String message;
	private Date created;
	private String author;
	
	
	public Message(){
	
	
	
	}
	public Message(long id, String message, String author) {
		this.Id = id;
		this.message = message;
		this.created = new Date();
		this.author = author;
	}
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	

}
