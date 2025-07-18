/**
 * Copyright 2025,all rights are reserved,Citibank pvt ltd.
 * 
 */
package com.keybank.balance.serviceclient;

import org.springframework.stereotype.Component;

import com.keybank.balance.model.FinanceServiceRequest;
import com.keybank.balance.model.FinanceServiceResponse;

/**
 * Description: 
 *	@author G3 3579 at 17-Jul-2025
 */
@Component
public class FinanceServiceClientImpl implements IFinanceServiceClient {

	@Override
	public FinanceServiceResponse getRegionInfo(FinanceServiceRequest financeRequest) {
		// prepare the request for financesvcclient and send the request and get the response
		
		FinanceServiceResponse financeResponse=new FinanceServiceResponse();
		financeResponse.setCardNumber(financeRequest.getCardNumber());
		financeResponse.setPrimary(true);
		financeResponse.setProductType("p001");
		financeResponse.setRegion("US");
		financeResponse.setStatus("active");
		return financeResponse;
	}

}
