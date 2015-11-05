package com.spacex.main;

import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.media.multipart.MultiPartFeature;
import org.glassfish.jersey.server.ResourceConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * @ClassName:SpaceXApplication.java

 * @Description: 项目主体类

 * @author Vino Dang

 * @date 2015年10月25日

 * @version V1.0
 */
public class SpaceXApplication extends ResourceConfig{
	
	private static final long serialVersionUID = 1L;
	private static Logger logger = LoggerFactory.getLogger(SpaceXApplication.class);
	
	public SpaceXApplication(){
		
		logger.info("SpaceX application starting");
        packages("com.spacex");
		register(SpaceXResponseFilter.class);
		register(JacksonFeature.class);
		register(MultiPartFeature.class);
	}

}
