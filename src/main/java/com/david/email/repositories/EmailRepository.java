package com.david.email.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.david.email.models.EmailModel;

public interface EmailRepository extends JpaRepository<EmailModel, UUID> {
    
}
