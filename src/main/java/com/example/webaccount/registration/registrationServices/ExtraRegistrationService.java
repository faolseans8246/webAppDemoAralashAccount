package com.example.webaccount.registration.registrationServices;

import com.example.webaccount.registration.registrRepository.RegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExtraRegistrationService implements RootRegistrationService {

    @Autowired
    private final RegistrationRepository registrationRepository;

    public ExtraRegistrationService (RegistrationRepository registrationRepository) {
        this.registrationRepository = registrationRepository;
    }



}
