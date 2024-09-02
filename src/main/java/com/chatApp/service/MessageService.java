package com.chatApp.service;
import java.util.List;

import com.chatApp.exception.ChatException;
import com.chatApp.exception.MessageException;
import com.chatApp.exception.UserException;
import com.chatApp.modal.Message;
import com.chatApp.request.SendMessageRequest;

public interface MessageService  {
	
	public Message sendMessage(SendMessageRequest req) throws UserException, ChatException;
	
	public List<Message> getChatsMessages(Integer chatId) throws ChatException;
	
	public Message findMessageById(Integer messageId) throws MessageException;
	
	public String deleteMessage(Integer messageId) throws MessageException;

}

