package com.airhacks;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author smccollum
 */
@Entity
public class Expression {
	@Id
	@GeneratedValue
	Long id;

	String expression;

	public Expression(){}

	public Expression(String expression){
		setExpression(expression);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getExpression() {
		return expression;
	}

	public void setExpression(String expression) {
		this.expression = expression;
	}
}
