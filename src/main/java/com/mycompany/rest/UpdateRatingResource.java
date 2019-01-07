/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.rest;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.Response;

/**
 * REST Web Service updateRating PUT path for updating the player ratings.
 *
 * @author a11817838 Ilari Malinen
 */
@Path("updateRating")
public class UpdateRatingResource {

    //Small array to keep track of the ratings.
    public static char[] ratingList = new char[5];

    /**
     * Creates a new instance of UpdateRatingResource
     */
    public UpdateRatingResource() {
    }

    /**
     *
     * @return response that the ratings have been updated.
     */
    @PUT
    public Response updateRating() {
        int[] votes = PostVoteResource.voteList;
        for (int i = 0; i < 5; i++) {
            if (votes[i] >= 15) {
                ratingList[i] = 'A';
            } else if (votes[i] >= 10) {
                ratingList[i] = 'B';
            } else if (votes[i] >= 5) {
                ratingList[i] = 'C';
            } else if (votes[i] < 5) {
                ratingList[i] = 'D';
            }
        }
        return Response.ok("Updated").build();
    }
}
