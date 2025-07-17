/**
 * Copyright 2025,all rights are reserved,Citibank pvt ltd.
 * 
 */
package com.keybank.balance.model;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Description: 
 *	@author G3 3579 at 17-Jul-2025
 */

@Data
@NoArgsConstructor
public class BalanceRequest {
	
	private String cardNumber;
	private String clientId;
	private String correlationId;
	private String channelId;
	private String messageTs;
	

}
