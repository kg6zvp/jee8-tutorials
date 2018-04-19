package com.airhacks;

import javax.inject.Inject;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

/**
 *
 * @author smccollum
 */
@Path("calculator")
public class CalculatorApi {
	@Inject
	Calculator calculator;

	@POST
	public Integer processExpression(String expression){
		return calculator.processRequest(expression);
	}
}
