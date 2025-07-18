/**
 * Copyright 2025,all rights are reserved,Citibank pvt ltd.
 * 
 */
package com.keybank.balance.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.keybank.balance.builder.BalanceRequestBuilder;
import com.keybank.balance.builder.BalanceResponseBuilder;
import com.keybank.balance.dao.IBalanceDao;
import com.keybank.balance.model.BalanceDaoRequest;
import com.keybank.balance.model.BalanceDaoResponse;
import com.keybank.balance.model.BalanceRequest;
import com.keybank.balance.model.BalanceResponse;
import com.keybank.balance.model.FinanceServiceRequest;
import com.keybank.balance.model.FinanceServiceResponse;
import com.keybank.balance.serviceclient.IFinanceServiceClient;

/**
 * Description: 
 *	@author G3 3579 at 17-Jul-2025
 */
@Service
public class BalanceServiceImpl implements IBalanceService {
	
	@Autowired
	private IFinanceServiceClient financeServiceClient;
	
	@Autowired
	IBalanceDao balanceDomesticDao;
	
	@Autowired
	IBalanceDao balanceIntlDao;
	
	@Autowired
	BalanceRequestBuilder balanceRequestBuilder;
	
	@Autowired
	BalanceResponseBuilder balanceResponseBuilder;
	@Override
	public BalanceResponse getBalance(BalanceRequest request) {
		
		BalanceDaoResponse balanceDaoResponse=null;
		BalanceResponse balanceResp=null;
		
		
		//1. Get the request from controller layer
		//2. prepare the call for financeserviceclient i.e Integration layer
		FinanceServiceRequest financeRequest= balanceRequestBuilder.buildFinanceRequest(request);
		
		FinanceServiceResponse financeResponse = financeServiceClient.getRegionInfo(financeRequest);
		
		//3. Get the response from financeserviceclient
		// preparing the request for dao layer
		BalanceDaoRequest daoRequest = balanceRequestBuilder.buildDaoRequest(request);
		//4. Apply business logic to identify whether it is domestic card or International card
		//5. prepare the call for second Integration layer i.e either domestic db or intl db
		if("active".equals(financeResponse.getStatus()) && "US".equals(financeResponse.getRegion())) {
			balanceDaoResponse = balanceDomesticDao.getBalance(daoRequest);
		}else if("active".equals(financeResponse.getStatus()) && "intl".equals(financeResponse.getRegion())) {
			balanceDaoResponse = balanceIntlDao.getBalance(daoRequest);
		}else {
			//TODO : throw user defined invalid region type exception
		}
		
		//6. convert the response from integration layer to Balance response
		
		 balanceResp=balanceResponseBuilder.buildBalanceResponse(balanceDaoResponse,financeResponse);
		
		//7. send the data to controller
		return balanceResp;
	}

}
