package com.sgic.springproject.service;

import java.util.List;
import com.sgic.springproject.entity.User;

public interface UserService {

  User addUser(User user);

  User updateUser(User user);

  List<User> getAllUser();

  boolean deleteUserById(Integer id);

}
