package com.mycompany.rest;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;
import cc2018.eurocupservice.Info;
import cc2018.eurocupservice.TTopScorerTop5;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 * REST Web Service listAll get path for get messages, returns 5 top scorers as
 * json string.
 *
 * @author a11817838 Ilari Malinen
 */
@Path("listAll")
public class ListAllResource {

    /**
     * Creates a new instance of GenericResource_1
     */
    public ListAllResource() {
    }

    /**
     * Retrieves representation of an instance of
     * com.mycompany.rest.GenericResource_1
     *
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String listAll() {
        Info info = new Info();
        JSONArray ret = new JSONArray();
        for (int i = 0; i < 5; i++) {
            TTopScorerTop5 scorer = info.getInfoSoap().topScorersList().getTTopScorerTop5().get(i);
            JSONObject tmp = new JSONObject();
            tmp.put("Goals", scorer.getIGoals());
            tmp.put("Name", scorer.getSName());
            try {
                tmp.put("Votes", PostVoteResource.voteList[i]);
            } catch (NullPointerException ex) {
                tmp.put("Votes", 0);
            }
            try {
                tmp.put("Rating", UpdateRatingResource.ratingList[i]);
            } catch (NullPointerException ex) {
                tmp.put("Rating", "D");
            }
            ret.add(tmp);
        }
        JSONObject obj = new JSONObject();
        // Wrap the array to an object
        obj.put("scorers", ret);
        
        return obj.toJSONString();
    }
}
