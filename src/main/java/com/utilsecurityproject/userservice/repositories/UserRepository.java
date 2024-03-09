package com.utilsecurityproject.userservice.repositories;

import com.utilsecurityproject.userservice.domain.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<AppUser, Long> {

    Optional<AppUser> findByUserName(String userName);

    Boolean existsByUserName(String userName);
}
