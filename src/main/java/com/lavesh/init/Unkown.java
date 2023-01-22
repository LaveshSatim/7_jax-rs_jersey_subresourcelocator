package com.lavesh.init;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

public class Unkown {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/start")
	public String get() {
		return "unknown";
	}
}
