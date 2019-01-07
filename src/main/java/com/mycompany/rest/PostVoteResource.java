/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.rest;

import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.POST;
import javax.ws.rs.PathParam;

/**
 * REST Web Service PostVote POST path for adding votes for the 5 players with
 * id. Used as postVote/{1-5}.
 *
 * @author a11817838 Ilari Malinen
 */
@Path("postVote/{id}")
public class PostVoteResource {

    //Small array to keep track of the votes
    public static int[] voteList = new int[5];

    ;

    /**
     * Creates a new instance of PostVoteResource
     */
    public PostVoteResource() {

    }

    /**
     * PUT method for updating or creating an instance of PostVoteResource
     *
     * @param id 1-5 id for the scorer vote is assigned to.
     * @return Ok or bad request response.
     */
    @POST
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.TEXT_PLAIN)
    public Response postVote(@PathParam("id") int id) {
        if (id < 6 && id > 0) {
            voteList[id - 1]++;
            return Response.ok("Voted for: " + id).build();
        } else {
            return Response.status(Response.Status.BAD_REQUEST).build();
        }
    }
}
