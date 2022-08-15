package com.david.email.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.david.email.models.EmailModel;

public interface EmailRepository extends JpaRepository<EmailModel, Long> {
    
}
