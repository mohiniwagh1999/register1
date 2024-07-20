package com.register.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.register.entity.User;

public interface UserRepo extends JpaRepository<User,Integer> {

}
