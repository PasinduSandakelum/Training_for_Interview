package com.sgic.springproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.sgic.springproject.entity.User;

@Repository
public interface UserRepositiry extends JpaRepository<User, Integer> {

}
