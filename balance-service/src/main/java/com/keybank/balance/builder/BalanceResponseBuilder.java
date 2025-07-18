/**
 * Copyright 2025,all rights are reserved,Citibank pvt ltd.
 * 
 */
package com.keybank.balance.builder;

import org.springframework.stereotype.Component;

import com.keybank.balance.model.BalanceDaoResponse;
import com.keybank.balance.model.BalanceResponse;
import com.keybank.balance.model.FinanceServiceResponse;

/**
 * Description: 
 *	@author G3 3579 at 18-Jul-2025
 */
@Component
public class BalanceResponseBuilder {

	/**
	 * @param balanceDaoResponse
	 * @param financeResponse
	 * @return
	 */
	public BalanceResponse buildBalanceResponse(BalanceDaoResponse balanceDaoResponse,
			                                    FinanceServiceResponse financeResponse) {
		
		BalanceResponse balanceResp=new BalanceResponse();
		//TODO: build the response
		
		
		return balanceResp;
	}

}
