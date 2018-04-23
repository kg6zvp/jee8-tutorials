package com.airhacks;

import javax.enterprise.inject.Produces;

/**
 *
 * @author smccollum
 */
public class CalculatorFactory {
	@Produces
	public Calculator buildInstance(){
		return new Calculator(true);
	}
}
