package com.airhacks;

import javax.enterprise.inject.Produces;
import javax.inject.Inject;

/**
 *
 * @author smccollum
 */
public class CalculatorFactory {
	@Inject
	ExpressionDao expDao;

	@Produces
	public Calculator buildInstance(){
		return new Calculator(true, expDao);
	}
}
