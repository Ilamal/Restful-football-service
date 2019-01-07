/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.rest;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.DELETE;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

/**
 * REST Web Service
 *
 * @author a11817838 Ilari Malinen
 */
@Path("resetVotes")
public class ResetVotesResource {

    /**
     * Creates a new instance of ResetVotesResource
     */
    public ResetVotesResource() {
    }

    /**
     * PUT method for updating or creating an instance of ResetVotesResource
     *
     * @return Response that votes have reset.
     */
    @DELETE
    public Response resetVotes() {
        for (int i = 0; i < PostVoteResource.voteList.length; i++) {
            PostVoteResource.voteList[i] = 0;
        }
        return Response.ok("Votes reset").build();
    }
}
