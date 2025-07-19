package com.eazybytes.accounts.service;

import com.eazybytes.accounts.dto.CustomerDTO;


public interface IAccountsService {

	void createAccount(CustomerDTO customerDTO);
	
	CustomerDTO fetchAccount(String mobileNumber);
	
	Boolean updateAccount(CustomerDTO customerDTO);
	
	Boolean deleteAccount(String mobileNumber);

	boolean updateCommunicationStatus(Long accountNumber);
}
