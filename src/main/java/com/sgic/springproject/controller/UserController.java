package com.sgic.springproject.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.sgic.springproject.entity.User;
import com.sgic.springproject.service.UserService;

@RestController
public class UserController {

  @Autowired
  private UserService userService;

  @GetMapping("/user")
  public ResponseEntity<List<User>> getAllUsers() {
    return new ResponseEntity<>(userService.getAllUser(), HttpStatus.OK);

  }

  @PostMapping("/user")
  public ResponseEntity<?> createUser(@RequestBody User user) {
    if (user != null) {
      return new ResponseEntity<>(userService.addUser(user), HttpStatus.CREATED);
    }
    return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
  }

  @PutMapping("/user")
  public ResponseEntity<?> updateUser(@RequestBody User user) {
    if (user != null) {
      return new ResponseEntity<>(userService.updateUser(user), HttpStatus.CREATED);
    }
    return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
  }
}
