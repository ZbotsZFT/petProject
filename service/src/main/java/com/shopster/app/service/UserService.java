package com.shopster.app.service;

import java.util.List;
import com.shopster.app.entity.User;
import com.shopster.app.entity.UserRequest;

/**
 * Created by fan.jin on 2016-10-15.
 */
public interface UserService {
  void resetCredentials();

  User findById(Long id);

  User findByUsername(String username);

  List<User> findAll();

  User save(UserRequest user);
}
