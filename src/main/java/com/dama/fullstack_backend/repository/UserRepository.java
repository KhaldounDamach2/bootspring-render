package com.dama.fullstack_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dama.fullstack_backend.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
