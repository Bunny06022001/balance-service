/**
 * Copyright 2025,all rights are reserved,Citibank pvt ltd.
 * 
 */
package com.keybank.balance.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

/**
 * Description: 
 *	@author G3 3579 at 18-Jul-2025
 */

@Configuration
public class BalanceSwaggerConfig {
		
		@Bean
		OpenAPI mycustomBalanceSwagger() {
			
			return new OpenAPI().info(new Info().title("This is my BalanceApp"));
			
		}
}
