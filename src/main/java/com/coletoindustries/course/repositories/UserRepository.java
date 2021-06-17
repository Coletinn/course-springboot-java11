package com.coletoindustries.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coletoindustries.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
