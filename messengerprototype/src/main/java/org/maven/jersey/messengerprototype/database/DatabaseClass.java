package org.maven.jersey.messengerprototype.database;

import java.util.HashMap;
import java.util.Map;

import org.maven.jersey.messengerprototype.model.Message;
import org.maven.jersey.messengerprototype.model.Profile;

public class DatabaseClass {
	
	
private static Map<Long, Message> messages = new HashMap<>();
private static Map<Long, Profile> profiles = new HashMap<>();
	public static Map<Long, Message> getMessages() {
		return messages;
	}
	public static Map<Long, Profile> getProfile() {
		return profiles;
	}
}
