package com.playground.ramusfp.repository;

import com.playground.ramusfp.entity.User;
import com.playground.ramusfp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    User findByEmail(String email);
}
