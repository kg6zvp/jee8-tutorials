package com.airhacks;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author smccollum
 */
@Path("people")
@Produces(MediaType.APPLICATION_JSON)
public class PeopleApi {
	@GET
	public Person getPerson(){
		Person p = new Person("Bourne", 35);
		System.out.println(p);
		return p;
	}

	@POST
	public Person postPerson(Person p){
		System.out.println("Person received: " + p);
		return p;
	}
}
