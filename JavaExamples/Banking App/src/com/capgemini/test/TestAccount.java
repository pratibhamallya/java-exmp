package com.capgemini.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.capgemini.exceptions.InsufficientInitialBalanceException;
import com.capgemini.exceptions.InvalidAccountNumberException;
import com.capgemini.repository.AccountRepository;
import com.capgemini.service.AccountServiceImpl;

public class TestAccount {
	private AccountRepository accountRepository;
	AccountServiceImpl accountServiceImpl = new AccountServiceImpl(accountRepository);

	@Test(expected=com.capgemini.exceptions.InsufficientInitialBalanceException.class)
	public void testCreateAccount() throws  InsufficientInitialBalanceException  {
		accountServiceImpl.createAccount(101,300);
		
		
	}

}
