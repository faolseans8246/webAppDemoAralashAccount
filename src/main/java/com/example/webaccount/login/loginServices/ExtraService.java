package com.example.webaccount.login.loginServices;

import com.example.webaccount.login.bazaTable.BazaTable;
import com.example.webaccount.login.loginRepository.LoginRepository;
import com.example.webaccount.login.loginServices.rootService.RootService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ExtraService implements RootService {

    @Autowired
    private LoginRepository loginRepository;

    @Override
    public void saveLogins(String logins, String parol) {

        BazaTable bazaTable = new BazaTable(logins, parol);
        this.loginRepository.save(bazaTable);

    }

}
