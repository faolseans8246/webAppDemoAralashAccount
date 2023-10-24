package com.example.webaccount.login.loginController;


import com.example.webaccount.login.loginServices.rootService.RootService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/head")
public class LoginController {

    @Autowired
    private final RootService rootService;

    public LoginController (RootService rootService) {
        this.rootService = rootService;
    }


    @GetMapping("/logins")
    public String loginPage() {
        return "home/login/loginPage";
    }

    @GetMapping("/toHomePage")
    public String goToHomePage() {
        return "/home/homePage";
    }
    
}
