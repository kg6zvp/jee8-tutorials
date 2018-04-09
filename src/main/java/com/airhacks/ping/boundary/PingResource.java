package com.airhacks.ping.boundary;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 *
 * @author airhacks.com
 */
@Path("mypath")
public class PingResource {

	@GET
	@Path("say_hello")
	public String helloWorld() {
		return "Hello, world!";
	}

}
