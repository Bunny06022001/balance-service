/**
 * Copyright 2025,all rights are reserved,Citibank pvt ltd.
 * 
 */
package com.keybank.balance.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.keybank.balance.exception.BalanceRequestInvalidException;
import com.keybank.balance.model.BalanceResponse;
import com.keybank.balance.model.StatusBlock;

/**
 * Description: 
 *	@author G3 3579 at 18-Jul-2025
 */
@RestControllerAdvice
public class BalanceControllerAdvice {
	@ExceptionHandler(value=BalanceRequestInvalidException.class)
	public BalanceResponse handleBalanceRequestInvalidExc(BalanceRequestInvalidException exception) {
		
		BalanceResponse balanceResponse=new BalanceResponse();
		StatusBlock statusBlock=new StatusBlock();
		statusBlock.setRespCode(exception.getErrorcode());
		statusBlock.setRespMsg(exception.getErrormsg());
		balanceResponse.setStatusBlock(statusBlock);
		
		
		return balanceResponse;
		
	}
}
