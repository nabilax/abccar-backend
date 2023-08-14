package com.xyzcarportal.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xyzcarportal.entity.User;

public interface UserRepo extends JpaRepository<User, Integer> {

}
