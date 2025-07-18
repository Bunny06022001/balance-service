/**
 * Copyright 2025,all rights are reserved,Citibank pvt ltd.
 * 
 */
package com.keybank.balance.builder;

import org.springframework.stereotype.Component;

import com.keybank.balance.model.BalanceDaoResponse;
import com.keybank.balance.model.BalanceResponse;
import com.keybank.balance.model.CardDetails;
import com.keybank.balance.model.FinanceServiceResponse;
import com.keybank.balance.model.StatusBlock;

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
		StatusBlock statusBlock=new StatusBlock();
		statusBlock.setRespCode(balanceDaoResponse.getRespCode());
		statusBlock.setRespMsg(balanceDaoResponse.getRespMsg());
		//TODO: build the response
		balanceResp.setStatusBlock(statusBlock);
		CardDetails cardDetails=new CardDetails();
		cardDetails.setCardNumber(financeResponse.getCardNumber());
		cardDetails.setAvailableBal(balanceDaoResponse.getAvailableBal());
		cardDetails.setOutstandingAmount(balanceDaoResponse.getOutstandingAmount());
		cardDetails.setTotalCreditLimitAmount(balanceDaoResponse.getTotalCreditLimitAmount());
		cardDetails.setRegion(financeResponse.getRegion());
		cardDetails.setProductType(financeResponse.getProductType());
		cardDetails.setPrimary(financeResponse.isPrimary());
		balanceResp.setCardDetails(cardDetails);
		
		
		
		return balanceResp;
	}

}
