/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.airhacks.ping.boundary;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

/**
 *
 * @author smccollum
 */
@Path("calculator")
public class Math {
	@QueryParam("a") int a;

	@QueryParam("b")
	int b;
	
	@GET
	@Path("add")
	public int add(@QueryParam("c") int lastNum){
		return a + b + lastNum;
	}

	@GET
	@Path("subtract")
	public int subtraction(){
		return a - b;
	}
}
