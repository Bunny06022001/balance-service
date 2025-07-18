/**
 * Copyright 2025,all rights are reserved,Citibank pvt ltd.
 * 
 */
package com.keybank.balance.exception;

import lombok.Getter;
import lombok.ToString;

/**
 * Description: 
 *	@author G3 3579 at 18-Jul-2025
 */

@Getter
@ToString
public class BalanceRequestInvalidException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2939078476764912222L;

	private String errorcode;
	private String errormsg;
	/**
	 * @param errorcode
	 * @param errormsg
	 */
	public BalanceRequestInvalidException(String errorcode, String errormsg) {
		
		this.errorcode = errorcode;
		this.errormsg = errormsg;
	}
}
