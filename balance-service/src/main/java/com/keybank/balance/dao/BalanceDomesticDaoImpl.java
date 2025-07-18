/**
 * Copyright 2025,all rights are reserved,Citibank pvt ltd.
 * 
 */
package com.keybank.balance.dao;

import org.springframework.stereotype.Repository;

import com.keybank.balance.model.BalanceDaoRequest;
import com.keybank.balance.model.BalanceDaoResponse;

/**
 * Description: 
 *	@author G3 3579 at 17-Jul-2025
 */
@Repository
public class BalanceDomesticDaoImpl implements IBalanceDao {

	@Override
	public BalanceDaoResponse getBalance(BalanceDaoRequest balancedaoRequest) {
		// TODO connect to database and get the data and send the rwquest
		
		BalanceDaoResponse daoResponse=new BalanceDaoResponse();
		daoResponse.setAvailableBal(9000);
		daoResponse.setOutstandingAmount(11000);
		daoResponse.setTotalCreditLimitAmount(20000);
		daoResponse.setRespCode("0");
		daoResponse.setRespMsg("success");
		return daoResponse;
	}

}
