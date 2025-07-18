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
public class FinanceServiceResponse {
	
	private String cardNumber;
	private String productType;
	private String region;
	private String status;
	private boolean isPrimary;
}
