package com.airhacks;

import java.util.Arrays;
import java.util.stream.Collectors;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author smccollum
 */
@RequestScoped
public class Calculator {
	final private boolean shouldLog;

	public Calculator(boolean shouldLog){
		this.shouldLog = shouldLog;
	}

	public int processRequest(String expression){
		if(shouldLog)
			System.out.println("Expression: " + expression);
		if(expression.contains("*")){
			Integer[] ops = parseOperation(expression, "\\*");
			return multiply(ops[0], ops[1]);
		}else if(expression.contains("+")){
			Integer[] ops = parseOperation(expression, "\\+");
			return add(ops[0], ops[1]);
		}else if(expression.contains("-")){
			Integer[] ops = parseOperation(expression, "-");
			return subtract(ops[0], ops[1]);
		}else if(expression.contains("/")){
			Integer[] ops = parseOperation(expression, "/");
			return divide(ops[0], ops[1]);
		}
		return 0;
	}

	private Integer[] parseOperation(String exp, String operation){
		return Arrays.stream(exp.split(operation))
		    		.map(Integer::valueOf)
		    		.collect(Collectors.toList())
		    		.toArray(new Integer[]{});
	}

	private int add(int a, int b){
		return a + b;
	}

	private int subtract(int a, int b){
		return a - b;
	}

	private int multiply(int a, int b){
		return a * b;
	}

	private int divide(int a, int b){
		return a / b;
	}
}
