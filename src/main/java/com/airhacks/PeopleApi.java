package com.airhacks;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 *
 * @author smccollum
 */
@Path("people")
public class PeopleApi {
	@GET
	public Person getPerson(){
		Person p = new Person("Bourne", 35);
		System.out.println(p);
		return p;
	}
}
