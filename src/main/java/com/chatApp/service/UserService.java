package com.chatApp.service;

import java.util.List;

import com.chatApp.dto.UserDto;
import com.chatApp.exception.UserException;
import com.chatApp.modal.User;
import com.chatApp.request.UpdateUserRequest;

public interface UserService {
	
	public User findUserProfile(String jwt);
	
	public User updateUser(Integer userId, UpdateUserRequest req) throws UserException;
	
	public User findUserById(Integer userId) throws UserException;
	
	public List<User> searchUser(String query);
}
