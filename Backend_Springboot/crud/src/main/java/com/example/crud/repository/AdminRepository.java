package com.example.crud.repository;
import org.springframework.data.jpa.repository.JpaRepository;


import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;
import com.example.crud.entity.*;
import java.util.Optional;
@EnableJpaRepositories
@Repository
public interface AdminRepository extends JpaRepository<AdminEntity,Integer> {
	 Optional<AdminEntity> findOneByEmailAndPassword(String email, String password);
	 AdminEntity findByEmail(String email);

}
