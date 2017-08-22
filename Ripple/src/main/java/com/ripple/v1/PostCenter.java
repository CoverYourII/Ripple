package com.ripple.v1;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.*;
import javax.ws.rs.core.*;

import com.ripple.common.Location;
import com.ripple.common.Post;


@Path("/v1")
public class PostCenter {
	
	@GET
	@Path("/getPosts/{userId}/{latitude}/{longtitude}/{radius}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getPosts(
			@PathParam("userId") Long userId,
			@PathParam("latitude") Double latitude,
			@PathParam("longtitude") Double longtitude,
			@PathParam("radius") Double radius)
	{
		Location location = new Location();
		location.setLatitude(15d);
		location.setLongtitude(20d);
		Post post = new Post();
		post.setContent("first post");
		post.setLocation(location);
		post.setTimestamp(new Timestamp(System.currentTimeMillis()));
		
		Post post2 = new Post();
		post2.setContent("second post");
		post2.setLocation(location);
		post2.setTimestamp(new Timestamp(System.currentTimeMillis()));
		
		List<Post> posts = new ArrayList<Post>();
		posts.add(post);
		posts.add(post2);
		
		return Response.ok(posts).build();
	}
	
	@POST
	@Path("/post")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response makePost(Post post)
	{
		// Use a client to test...
		// Then store in DB
		
		return Response.status(201).entity("did nothing").build();
	}

}
