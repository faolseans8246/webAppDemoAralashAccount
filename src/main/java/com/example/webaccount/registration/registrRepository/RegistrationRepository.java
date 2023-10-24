package com.example.webaccount.registration.registrRepository;

import com.example.webaccount.registration.registrationTable.RegistrationTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistrationRepository extends JpaRepository<RegistrationTable, Long>, CrudRepository<RegistrationTable, Long> {
}
