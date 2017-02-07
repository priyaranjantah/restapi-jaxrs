package org.maven.jersey.messengerprototype.model;

import java.util.Date;

public class Profile {
	private long Id;
	private String profileName;
	private String firstName;
	private String lastName;
	private Date created;
	
	public Profile(){
		
	}

	public Profile(long id, String profileName, String firstName, String lastName, Date created) {
		super();
		Id = id;
		this.profileName = profileName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.created = created;
	}

	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	public String getProfileName() {
		return profileName;
	}

	public void setProfileName(String profileName) {
		this.profileName = profileName;
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
