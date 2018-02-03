package com.shopster.app.service;

import java.util.List;
import com.shopster.app.entity.Authority;

public interface AuthorityService {
  List<Authority> findById(Long id);

  List<Authority> findByname(String name);

}
