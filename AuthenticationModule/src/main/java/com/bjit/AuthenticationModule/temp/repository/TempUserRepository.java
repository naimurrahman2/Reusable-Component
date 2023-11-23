package com.bjit.AuthenticationModule.temp.repository;

import com.bjit.AuthenticationModule.temp.entity.TempUser;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface TempUserRepository extends JpaRepository<TempUser,Long> {

    Optional<TempUser> findByToken(String token);

}
