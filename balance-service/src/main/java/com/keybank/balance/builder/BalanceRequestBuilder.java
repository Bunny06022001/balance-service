/**
 * Copyright 2025,all rights are reserved,Citibank pvt ltd.
 * 
 */
package com.keybank.balance.builder;

import org.springframework.stereotype.Component;

import com.keybank.balance.model.BalanceDaoRequest;
import com.keybank.balance.model.BalanceRequest;
import com.keybank.balance.model.FinanceServiceRequest;

/**
 * Description: 
 *	@author G3 3579 at 18-Jul-2025
 */
@Component
public class BalanceRequestBuilder {

	/**
	 * @param request
	 * @return financeRequest
	 */
	public FinanceServiceRequest buildFinanceRequest(BalanceRequest request) {

		FinanceServiceRequest financeRequest=new FinanceServiceRequest();
		financeRequest.setCardNumber(request.getCardNumber());
		financeRequest.setClientId(request.getClientId());
		financeRequest.setRequestId(request.getCorrelationId());
		
		return financeRequest;
	}

	/**
	 * @param request
	 * @return daoRequest
	 */
	public BalanceDaoRequest buildDaoRequest(BalanceRequest request) {
		BalanceDaoRequest daoRequest=new BalanceDaoRequest();
		daoRequest.setCardNumber(request.getCardNumber());
		daoRequest.setClientId(request.getClientId());
		daoRequest.setRequestId(request.getCorrelationId());
		
		return daoRequest;
		
		
	}

}
