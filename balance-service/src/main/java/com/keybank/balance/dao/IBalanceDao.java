/**
 * Copyright 2025,all rights are reserved,Citibank pvt ltd.
 * 
 */
package com.keybank.balance.dao;

import com.keybank.balance.model.BalanceDaoRequest;
import com.keybank.balance.model.BalanceDaoResponse;

/**
 * Description: 
 *	@author G3 3579 at 17-Jul-2025
 */
public interface IBalanceDao {
	
	BalanceDaoResponse getBalance(BalanceDaoRequest balanceDaoRequest);
}
