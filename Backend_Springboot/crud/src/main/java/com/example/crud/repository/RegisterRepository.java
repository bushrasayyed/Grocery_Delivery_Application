package com.example.crud.repository;
import com.example.crud.entity.UserRegister;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@EnableJpaRepositories
@Repository
public interface RegisterRepository extends JpaRepository<UserRegister,Integer>
{
      Optional<UserRegister> findOneByEmailAndPassword(String email, String password);
    UserRegister findByEmail(String email);
    
}