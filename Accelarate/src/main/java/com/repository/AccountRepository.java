package com.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.model.Account;

public interface AccountRepository extends JpaRepository<Account,String>{

}
