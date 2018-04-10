package com.airhacks.ping.boundary;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

/**
 *
 * @author airhacks.com
 */
@Path("mypath")
public class PingResource {

	@GET
	@Path("say_hello")
	public String sayHello(@QueryParam("n") String name, @QueryParam("a") int age) {
		if(name == null)
			return "Sorry, I don't say hello to nulls";
		return "Hello, " + name + "! You must be " + age + " years old.";
	}

}
