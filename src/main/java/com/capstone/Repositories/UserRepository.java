package com.capstone.Repositories;

import com.capstone.Entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface UserRepository extends JpaRepository<Users, Long> {
    // Select * FROM student WHERE email = ?
    @Query("SELECT s FROM Users s WHERE s.email = ?1")
    Optional<Users> findStudentByEmail(String email);
}
