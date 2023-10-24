package com.example.webaccount.login.loginRepository;

import com.example.webaccount.login.bazaTable.BazaTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepository extends JpaRepository<BazaTable, Long>, CrudRepository<BazaTable, Long> {
}
