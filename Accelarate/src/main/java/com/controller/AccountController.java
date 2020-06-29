package com.controller;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.model.Account;
import com.service.AccountService;

@RestController
public class AccountController {
	
	@Autowired
	private AccountService accountService;
	
	//Retrieve
	@GetMapping("/accounts")
	public List<Account> list(){
		return accountService.getAllAccounts();
	}
	//Create
	@PostMapping("/accounts")
	public void add(@RequestBody Account acc) {
		accountService.save(acc);
	}
	//Update
	@PutMapping("/accounts/{acc_no}")
	public ResponseEntity<?> update(@RequestBody Account acc,@PathVariable String acc_no){
		try {
			Optional<Account> existAccount = accountService.get(acc_no);
			accountService.save(acc);
			return new ResponseEntity<>(HttpStatus.OK);
		}catch(NoSuchElementException e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	//Delete
	@DeleteMapping("account/{acc_no}")
	public void delete(@PathVariable String acc_no) {
		accountService.deleteAccount(acc_no);
	}
}
