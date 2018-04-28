package com.airhacks;

import java.util.List;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author smccollum
 */
@Path("calculator")
@Produces(MediaType.APPLICATION_JSON)
public class CalculatorApi {
	@Inject
	Calculator calculator;

	@Inject
	ExpressionDao expDao;

	@POST
	public Integer processExpression(String expression){
		return calculator.processRequest(expression);
	}

	@GET
	public List<Expression> getAllRunExpressions(){
		return expDao.getAll();
	}
}
