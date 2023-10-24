package com.example.webaccount.registration.registrationController;

import com.example.webaccount.registration.registrationServices.RootRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/registration_page")
public class RegistrationController {

    @Autowired
    private final RootRegistrationService rootRegistrationService;

    public RegistrationController (RootRegistrationService registrationService) {
        this.rootRegistrationService = registrationService;
    }

    @GetMapping("/registration")
    public String toRegistrationPage() {
        return "/home/registration/registrationPage";
    }

    @GetMapping("/goToHome")
    public String goToHome() {
        return "/home/homePage";
    }

    @GetMapping("/goToSign")
    public String goToSignIn() {
        return "/home/login/loginPage";
    }

}
