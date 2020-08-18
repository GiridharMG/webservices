package com.tyss.webservices.api.services;

import javax.ws.rs.Consumes;
import javax.ws.rs.CookieParam;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.NewCookie;
import javax.ws.rs.core.Response;

import com.tyss.webservices.dto.Data;

@Path("/calculator")
public class Services {
	@GET
	@Path("/add")
	@Produces(MediaType.APPLICATION_JSON)
	public Data add(@QueryParam("a") int a, @QueryParam("b") int b) {
		return new Data(a, b, "add", a + b);
	}
	
	@GET
	@Path("/multiply")
	@Produces(MediaType.APPLICATION_JSON)
	public Data multiply(@HeaderParam("a") int a, @HeaderParam("b") int b) {
		return new Data(a, b, "multiply", a * b);
	}
	
	@POST
	@Path("/subtract")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Data subtract(Data data) {
		data.setType("subtract");
		data.setValue(data.getA() - data.getB());
		return data;
	}
	
	@GET
	@Path("/divide/{a}/{b}")
	@Produces(MediaType.APPLICATION_JSON)
	public Data divide(@PathParam("a") int a, @PathParam("b") int b) {
		return new Data(a, b, "divide", a / b);
	}
	
	@GET
	@Path("create-cookie")
	public Response createCookie() {
		NewCookie cookie = new NewCookie("Name", "Sandhiya Arunbabu");
		return Response.ok()
				.cookie(cookie)
				.entity("cookie created")
				.build();
	}
	
	@GET
	@Path("read-cookie")
	public String readCookie(@CookieParam("Name") String name) {
		return name;
	}
}




