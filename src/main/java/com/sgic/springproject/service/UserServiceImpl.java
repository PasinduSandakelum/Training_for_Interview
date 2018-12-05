package com.sgic.springproject.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sgic.springproject.entity.User;
import com.sgic.springproject.repository.UserRepositiry;

@Service
public class UserServiceImpl implements UserService {

  @Autowired
  private UserRepositiry userRepository;

  @Override
  public User addUser(User user) {
    return userRepository.save(user);
  }

  @Override
  public User updateUser(User userEdit) {
    return userRepository.findById(userEdit.getId()).map(user -> {
      user.setUserName(userEdit.getUserName());
      user.setEmail(userEdit.getEmail());
      user.setServicePeriod(userEdit.getServicePeriod());
      return userRepository.save(user);
    }).orElse(null);
  }

  @Override
  public List<User> getAllUser() {
    List<User> users = new ArrayList<>();
    try {
      users = userRepository.findAll();
    } catch (Exception e) {
      e.printStackTrace();
    }
    return users;
  }

  @Override
  public boolean deleteUserById(Integer id) {
    // TODO Auto-generated method stub
    return false;
  }

}
