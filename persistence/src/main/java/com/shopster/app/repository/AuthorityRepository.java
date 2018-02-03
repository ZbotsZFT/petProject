package com.shopster.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.shopster.app.entity.Authority;

public interface AuthorityRepository extends JpaRepository<Authority, Long> {
  Authority findByName(String name);
}
