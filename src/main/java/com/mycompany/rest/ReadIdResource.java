/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.rest;

import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import cc2018.eurocupservice.Info;
import cc2018.eurocupservice.TTopScorerTop5;
import javax.ws.rs.PathParam;
import org.json.simple.JSONObject;

/**
 * REST Web Service ReadId GET path for reading one players information with id.
 *
 * @author a11817838 Ilari Malinen
 */
@Path("readId/{id}")
public class ReadIdResource {

    /**
     * Creates a new instance of GenericResource
     */
    public ReadIdResource() {
    }

    /**
     * Retrieves representation of an instance of getById
     *
     * @param id 1-5 id of the player wanted
     * @return information of the player
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getById(@PathParam("id") int id) {

        Info info = new Info();
        TTopScorerTop5 scorer;
        if (id > 0 && id < 6) {
            scorer = info.getInfoSoap().topScorersList().getTTopScorerTop5().get(id - 1);
        } else {
            return "unknown number";
        }
        JSONObject json = new JSONObject();
        json.put("Votes", PostVoteResource.voteList[id - 1]);
        json.put("Goals", scorer.getIGoals());
        json.put("Name", scorer.getSName());
        json.put("Rating", UpdateRatingResource.ratingList[id - 1]);
        return json.toJSONString();
    }

}
