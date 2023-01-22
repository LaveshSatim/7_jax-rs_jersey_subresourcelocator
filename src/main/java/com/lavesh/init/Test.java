package com.lavesh.init;

import java.util.UUID;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/test")
public class Test {

	@Path("/{location}/path")
	public Object get(@PathParam("location") String location) {

		if (location.equals("abc")) {
			return new Abc();
		} else if (location.equals("pqr")) {

			return new Pqr();
		} else {

			return new Unkown();
		}
	}
}
