package com.spacex.service;

import javax.ws.rs.core.Response;

/**
 * 
 * @ClassName:SpaceXBusinessService.java

 * @Description: SpaceXBusinessService接口

 * @author Vino Dang

 * @date 2015年10月25日

 * @version V1.0
 */
public interface SpaceXBusinessService {
	
	Response selectAutoComplete(String keyWord);

	Response selectBusinessList(String keyWord, String selectedName, int currentPage, int pageSize);
	
}
