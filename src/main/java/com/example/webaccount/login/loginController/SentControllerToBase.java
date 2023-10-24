package com.example.webaccount.login.loginController;

import com.example.webaccount.login.bazaTable.BazaTable;
import com.example.webaccount.login.loginRepository.LoginRepository;
import com.example.webaccount.login.loginServices.rootService.RootService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/saveLogin")
public class SentControllerToBase {

    @Autowired
    private RootService rootService;

    @PostMapping("/saveToBaseFromLogin")
    public String saveToBase(@RequestParam (value = "logins") String logins, @RequestParam (value = "parol") String parol) {

        BazaTable bazaTable = new BazaTable();
        bazaTable.setLogins(logins);
        bazaTable.setParol(parol);

        this.rootService.saveLogins(logins, parol);
        return "/home/login/loginPage";
    }

    @GetMapping("/toHomePage")
    public String goToHomePage() {
        return "/home/homePage";
    }

    @GetMapping("/goToSignUp")
    public String goToSignUp() {
        return "/home/registration/registrationPage";
    }

}
