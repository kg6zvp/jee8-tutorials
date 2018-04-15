package com.airhacks.ping;

import java.util.HashMap;
import java.util.Map;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

/**
 *
 * @author smccollum
 */
@Path("ages")
public class AgesApi {
	Map<String, Integer> ages;

	public AgesApi(){
		ages = new HashMap<>();
		ages.put("Bob", 25);
		ages.put("Larry", 35);
	}

	@GET
	public String getPeopleList(){
		return String.join(",", ages.keySet());
	}

	@GET
	@Path("{name}")
	public Integer getAge(@PathParam("name")String givenName){
		return ages.get(givenName);
	}
}
