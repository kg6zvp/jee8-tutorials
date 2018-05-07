package com.airhacks;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.PrePersist;

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

	Long timestamp;
	
	public Expression(){ }

	public Expression(String expression){
		setExpression(expression);
	}

	@PrePersist
	private void setTimestamp(){
		setTimestamp(System.currentTimeMillis());
	}

	public Long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
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
