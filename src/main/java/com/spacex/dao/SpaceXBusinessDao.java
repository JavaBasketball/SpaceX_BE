package com.spacex.dao;

import java.util.List;

import com.spacex.model.SpaceXBusinessModel;


/**
 * 
 * @ClassName:SpaceXBusinessDao.java

 * @Description: SpaceXBusinessDao 接口

 * @author Vino Dang

 * @date 2015年10月25日

 * @version V1.0
 */
public interface SpaceXBusinessDao<T> extends BaseDao<T> {

	List<SpaceXBusinessModel> selectAutoComplete(Object obj);
	
}
