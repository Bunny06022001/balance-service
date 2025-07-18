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
public class FinanceServiceRequest {
	
	private String cardNumber;
	private String clientId;
	private String requestId;

}
