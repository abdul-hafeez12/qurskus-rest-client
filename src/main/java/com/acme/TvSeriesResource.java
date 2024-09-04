package com.acme;

import com.acme.model.TvSeries;
import com.acme.proxy.TvSeriesProxy;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import java.util.ArrayList;
import java.util.List;


@Path("/tvseries")
public class TvSeriesResource {

    @RestClient
    TvSeriesProxy proxy;

    private List<TvSeries> tvSeries = new ArrayList();


    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response get(@QueryParam("title") String title){
        TvSeries tvsr= proxy.get(title);
        tvSeries.add(tvsr);
        return Response.ok(tvSeries).build();
    }
}
