/**
 * Copyright 2025,all rights are reserved,Citibank pvt ltd.
 * 
 */
package com.keybank.balance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.keybank.balance.exception.BalanceRequestInvalidException;
import com.keybank.balance.model.BalanceRequest;
import com.keybank.balance.model.BalanceResponse;
import com.keybank.balance.service.IBalanceService;
import com.keybank.balance.validator.BalanceRequestValidator;

/**
 * Description: 
 *	@author G3 3579 at 17-Jul-2025
 */

@RestController
public class BalanceController {
	
	@Autowired
	private BalanceRequestValidator balanceRequestValidator;
	
	@Autowired
	private IBalanceService balanceService;
	
	@GetMapping("/v1/balance/{cardnumber}")
	public BalanceResponse getBalance(@PathVariable("cardnumber") String cardNumber,
			                          @RequestHeader("x-client-id") String clientId,
			                          @RequestHeader("x-channel-id") String channelId,
			                          @RequestHeader("x-correlation-id") String correlationId,
			                          @RequestHeader("x-message-ts") String messageTs) throws BalanceRequestInvalidException {
		
		
		//1. Get the request from the client
		BalanceRequest request=new BalanceRequest();
		request.setCardNumber(cardNumber);
		request.setChannelId(channelId);
		request.setClientId(clientId);
		request.setCorrelationId(correlationId);
		request.setMessageTs(messageTs);
		//2. validate the request
		balanceRequestValidator.validateRequest(request);
		//3. prepare the call to service layer 
		BalanceResponse balance = balanceService.getBalance(request);

		return balance;
		
	}

}
