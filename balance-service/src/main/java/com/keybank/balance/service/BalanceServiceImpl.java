/**
 * Copyright 2025,all rights are reserved,Citibank pvt ltd.
 * 
 */
package com.keybank.balance.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.keybank.balance.dao.IBalanceDao;
import com.keybank.balance.model.BalanceRequest;
import com.keybank.balance.model.BalanceResponse;
import com.keybank.balance.serviceclient.IFinanceServiceClient;

/**
 * Description: 
 *	@author G3 3579 at 17-Jul-2025
 */
@Service
public class BalanceServiceImpl implements IBalanceService {
	
	@Autowired
	private IFinanceServiceClient financeServiceClient;
	
	@Autowired
	private IBalanceDao balanceDao;

	@Override
	public BalanceResponse getBalance(BalanceRequest request) {
		
		//1. Get the request from controller layer
		//2. prepare the call for financeserviceclient i.e Integration layer
		//3. Get the response from financeserviceclient
		//4. Apply business logic to identify whether it is domestic card or International card
		//5. prepare the call for second Integration layer i.e either domestic db or intl db
		//6. convert the response from integration layer to Balance response
		//7. send the data to controller
		return null;
	}

}
