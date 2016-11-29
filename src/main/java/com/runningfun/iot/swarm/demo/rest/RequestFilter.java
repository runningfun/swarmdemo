package com.runningfun.iot.swarm.demo.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.Provider;
import java.io.IOException;
import java.util.Set;

/**
 * Created by Stefan on 11.09.2016.
 */
@Provider
public class RequestFilter implements ContainerRequestFilter {
    static final Logger logger= LoggerFactory.getLogger(RequestFilter.class);
    @Override
    public void filter(ContainerRequestContext containerRequestContext) throws IOException {
       MultivaluedMap<String, String> headerMap= containerRequestContext.getHeaders();
                                 Set<String> headers= headerMap.keySet();
        for (String header:headers){
                           logger.info("header {}, value {}",header, headerMap.get(header));
        }
    }
}
