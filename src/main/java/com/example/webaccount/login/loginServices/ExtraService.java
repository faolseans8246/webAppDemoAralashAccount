package com.example.webaccount.login.loginServices;

import com.example.webaccount.login.bazaTable.BazaTable;
import com.example.webaccount.login.loginRepository.LoginRepository;
import com.example.webaccount.login.loginServices.rootService.RootService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExtraService implements RootService {

    @Autowired
    private final LoginRepository loginRepository;

    public ExtraService (LoginRepository loginRepository) {
        this.loginRepository = loginRepository;
    }

    @Override
    public void saveRegistr(BazaTable bazaTable) {
        this.loginRepository.save(bazaTable);
    }

}
