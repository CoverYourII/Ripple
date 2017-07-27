package com.socialclub;

import javax.ws.rs.*;
import javax.ws.rs.core.*;


@Path("/test")
public class TestAPI {
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String returnTitle()
	{
		return "<p> successed ! </p>";
	}

}
