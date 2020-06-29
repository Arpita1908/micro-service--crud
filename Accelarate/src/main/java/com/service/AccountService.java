package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.model.Account;
import com.repository.AccountRepository;

@Service
@Transactional
public class AccountService {
	@Autowired
	private AccountRepository accountRepository;
	
	public List<Account> getAllAccounts(){
		return accountRepository.findAll();
	}
	public void save(Account acc) {
		accountRepository.save(acc);
	}
	public Optional<Account> get(String acc_no) {
		return accountRepository.findById(acc_no);	
	}
	public void deleteAccount(String acc_no) {
		accountRepository.deleteById(acc_no);
	}
}

