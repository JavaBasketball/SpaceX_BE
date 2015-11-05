package com.spacex.main;

import java.io.IOException;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.core.MultivaluedMap;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * 
 * @ClassName:SpaceXResponseFilter.java

 * @Description: 过滤类，解决跨域访问

 * @author Vino Dang

 * @date 2015年10月25日

 * @version V1.0
 */
public class SpaceXResponseFilter implements ContainerResponseFilter{
	private static Logger logger = LoggerFactory.getLogger(SpaceXResponseFilter.class);
	private static final long serialVersionUID = 1L;
	
    public SpaceXResponseFilter(){
    	logger.info("SpaceX Application has already started");
    }
	
	public void filter(ContainerRequestContext requestContext,
			ContainerResponseContext responseContext) throws IOException {
		// TODO Auto-generated method stub
       MultivaluedMap<String, Object> headers = responseContext.getHeaders();
		
		headers.add("Access-Control-Allow-Origin", "*");
		//headers.add("Access-Control-Allow-Origin", "http://podcastpedia.org"); //allows CORS requests only coming from podcastpedia.org		
		headers.add("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT");			
		headers.add("Access-Control-Allow-Headers", "X-Requested-With, Content-Type, X-Codingpedia");
		//headers.add("Access-Control-Allow-Headers", "*");
	}



}
