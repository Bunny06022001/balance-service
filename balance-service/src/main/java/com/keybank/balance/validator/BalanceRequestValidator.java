/**
 * Copyright 2025,all rights are reserved,Citibank pvt ltd.
 * 
 */
package com.keybank.balance.validator;

import org.springframework.stereotype.Component;

import com.keybank.balance.exception.BalanceRequestInvalidException;
import com.keybank.balance.model.BalanceRequest;

/**
 * Description: 
 *	@author G3 3579 at 17-Jul-2025
 */

@Component
public class BalanceRequestValidator {
	
	
	public void validateRequest(BalanceRequest request) throws BalanceRequestInvalidException {
		
		//todo: Implement all the validations for mandatory elements
		if( request.getCardNumber().length() <= 6 ) {
			System.out.println("in validator class");
			throw new BalanceRequestInvalidException("101", "request object is null");
		}
		
	}
}
