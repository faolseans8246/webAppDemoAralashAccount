package com.example.webaccount.registration.registrationServices;

import com.example.webaccount.registration.registrRepository.RegistrationRepository;
import com.example.webaccount.registration.registrationTable.RegistrationTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExtraRegistrationService implements RootRegistrationService {

    @Autowired
    private final RegistrationRepository registrationRepository;

    public ExtraRegistrationService (RegistrationRepository registrationRepository) {
        this.registrationRepository = registrationRepository;
    }


    @Override
    public void userRegistrationSave(String username, String email, String password, String confirm_password) {
        RegistrationTable registrationTable = new RegistrationTable();
        registrationTable.setUsername(username);
        registrationTable.setEmail(email);
        registrationTable.setPassword(password);
        registrationTable.setConfirm_password(confirm_password);

        registrationRepository.save(registrationTable);
    }


}
