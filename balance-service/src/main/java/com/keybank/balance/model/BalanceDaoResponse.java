/**
 * Copyright 2025,all rights are reserved,Citibank pvt ltd.
 * 
 */
package com.keybank.balance.model;

import lombok.Data;

/**
 * Description: 
 *	@author G3 3579 at 17-Jul-2025
 */
@Data
public class BalanceDaoResponse {
	private String respCode;
	private String respMsg;
	private long availableBal;
	private long outstandingAmount;
	private long totalCreditLimitAmount;
	
}
