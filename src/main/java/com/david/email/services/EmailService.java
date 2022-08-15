package com.david.email.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.david.email.repositories.EmailRepository;

@Service
public class EmailService {

    @Autowired
    EmailRepository emailRepository;
}
