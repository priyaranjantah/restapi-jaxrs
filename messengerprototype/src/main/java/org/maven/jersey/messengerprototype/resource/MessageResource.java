package org.maven.jersey.messengerprototype.resource;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.maven.jersey.messengerprototype.model.Message;
import org.maven.jersey.messengerprototype.service.MessageService;

@Path("/messages")
public class MessageResource {
	MessageService messageservice = new MessageService();
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Message>getMessages(){
		return messageservice.getAllMessages();
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Message addMessage(Message message){
		return messageservice.addMessage(message);
}
	
	@PUT
	@Path("/{messageId}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
    public Message updateMessage(@PathParam("messageId")long Id, Message message){
		message.setId(Id);
	return messageservice.updateMessage(message);
}
		
	@DELETE
	@Path("/{messageId}")
	@Produces(MediaType.APPLICATION_JSON)
public void deleteMessage(@PathParam("messageId")long Id){
		messageservice.removeMessage(Id);	
	
}
	@GET
	@Path("/{messageId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Message getMessage(@PathParam("messageId")long Id){
		return messageservice.getMessage(Id);
		
}
}
