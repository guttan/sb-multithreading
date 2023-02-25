package com.example.executor.api.repository;

import com.example.executor.api.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepsitory extends JpaRepository<User, Integer> {

}
