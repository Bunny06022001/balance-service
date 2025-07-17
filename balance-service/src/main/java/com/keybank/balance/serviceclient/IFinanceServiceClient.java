/**
 * Copyright 2025,all rights are reserved,Citibank pvt ltd.
 * 
 */
package com.keybank.balance.serviceclient;

import com.keybank.balance.model.FinanceServiceRequest;
import com.keybank.balance.model.FinanceServiceResponse;

/**
 * Description: 
 *	@author G3 3579 at 17-Jul-2025
 */
public interface IFinanceServiceClient {
	
	FinanceServiceResponse getRegionInfo(FinanceServiceRequest financeRequest);
}
