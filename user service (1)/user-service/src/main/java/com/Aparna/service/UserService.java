package com.Aparna.service;

import com.Aparna.exception.UserException;
import com.Aparna.model.User;

import java.util.List;

public interface UserService {

    User createUser(User user);

    User getUserById(Long id) throws UserException;
    List<User> getUser();

    User updateUser(Long id,User user) throws UserException;

    void deleteUser(Long id) throws UserException;

}
