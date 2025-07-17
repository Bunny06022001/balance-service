/**
 * Copyright 2025,all rights are reserved,Citibank pvt ltd.
 * 
 */
package com.keybank.balance.service;

import com.keybank.balance.model.BalanceRequest;
import com.keybank.balance.model.BalanceResponse;

/**
 * Description: 
 *	@author G3 3579 at 17-Jul-2025
 */
public interface IBalanceService {
	
	BalanceResponse getBalance(BalanceRequest request);

}
