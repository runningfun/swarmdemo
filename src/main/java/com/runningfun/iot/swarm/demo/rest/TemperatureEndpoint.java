package com.runningfun.iot.swarm.demo.rest;

import com.runningfun.iot.swarm.demo.business.DHTService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

/**
 * Created by Herschbach.Stefan on 28.11.2016.
 */
@Path("/temperature")
public class TemperatureEndpoint {

    static final Logger logger= LoggerFactory.getLogger(TemperatureEndpoint.class);

    @Inject
    DHTService dhtService;

    @GET
    public String getTemperatureValue(){
        return String.valueOf(dhtService.getTemperatureValue());
    }

    @PUT
    public Response setTemp(@QueryParam("value") double temperatureValue){
        logger.info("temperatureValue received " + temperatureValue);

        this.dhtService.setTemperatureValue(temperatureValue);

        return Response.status(202).build();
    }

}
