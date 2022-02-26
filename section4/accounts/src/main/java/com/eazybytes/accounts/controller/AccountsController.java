/**
 * 
 */
package com.eazybytes.accounts.controller;

import com.eazybytes.accounts.AccountsDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.eazybytes.accounts.model.Accounts;
import com.eazybytes.accounts.model.Customer;
import com.eazybytes.accounts.repository.AccountsRepository;

/**
 * @author Eazy Bytes
 *
 */

@RestController
public class AccountsController {
	
	@Autowired
	private AccountsRepository accountsRepository;

	@PostMapping("/myAccount")
	public AccountsDto getAccountDetails(@RequestBody Customer customer) {

		Accounts accounts = accountsRepository.findByCustomerId(customer.getCustomerId());
		AccountsDto accountsDto = new AccountsDto();
		accountsDto.convertToDto(accounts);

		if (accounts != null) {
			return accountsDto;
		} else {
			return null;
		}

	}

}
