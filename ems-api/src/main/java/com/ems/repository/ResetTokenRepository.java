package com.ems.repository;

import com.ems.entities.ResetToken;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface ResetTokenRepository extends JpaRepository<ResetToken, Long> {

    @Query("select r from ResetToken r where r.token=?1")
    public ResetToken FindByToken(String token);
    public Optional<ResetToken> findByToken(String token);
    public Optional<ResetToken> findByEmail(String email);
}
