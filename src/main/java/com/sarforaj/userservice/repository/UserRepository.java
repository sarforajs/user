package com.sarforaj.userservice.repository;

import com.sarforaj.userservice.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
