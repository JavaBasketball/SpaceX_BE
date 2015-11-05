package com.spacex.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.spacex.dao.BaseDao;
import com.spacex.util.StringUtil;

/**
 * 
 * @ClassName:BaseService.java

 * @Description: 底层Service接口

 * @author Vino Dang

 * @date 2015年10月25日

 * @version V1.0
 */
public abstract class BaseService<T>{
	
	private static Logger logger = LoggerFactory.getLogger(BaseService.class);
	public abstract BaseDao<T> getDao();
	
	public Integer insert(T t) {
		Integer pkId = getDao().insert(t);
		if(pkId > 0){
			logger.info("inserted successfully! id=" + pkId);
			return pkId;
		}
		else {
			logger.error("inserted failure! id=" + pkId);
			return null;
		}
	}
	
	public void update(T t) {
		getDao().update(t);
	}
	
	
	public void updateBySelective(T t){
		getDao().updateBySelective(t);
	}	
	
	public void delete(Object id){
		getDao().delete(id);
	}
	

	public int queryByCount(T t) {
		return getDao().queryByCount(t);
	}
	
	public List<T> queryList(T t) {
		return getDao().queryList(t);
	}
	
	public T queryObject(T t){
		return getDao().queryObject(t);
	}
	
	public T queryById(Object obj){
		return getDao().queryById(obj);
	}
	
	public T queryByPK(Object obj){
		return getDao().queryByPK(obj);
	}
	
	public Integer insertList(List<T> list){
		return getDao().insertList(list);
	}
	
	public void merge(T t1, T t2){
		if(StringUtil.isNotNull(t1)){
			getDao().update(t2);
		}
		else {
			getDao().insert(t2);
		}
	}
	
	public void merge(T t){
	    if(StringUtil.isNull(getDao().queryObject(t))){
	    	getDao().insert(t);
	    }
	    else {
	    	getDao().update(t);
	    }
	}
	
	/**
	 * 批量更新
	 * @Title: batchUpdate 
	 * @Description: TODO(这里用一句话描述这个方法的作用) 
	 * @param @param list    设定文件 
	 * @return void    返回类型 
	 * @throws
	 * @author vino     
	 * @date Jan 28, 2015 9:27:13 PM  
	 * @version V1.0
	 */
	public void batchUpdate(List<T> list){
		getDao().batchUpdate(list);
	}
	
	/**
	 * 批量删除
	 * @Title: batchDelete 
	 * @Description: TODO(这里用一句话描述这个方法的作用) 
	 * @param @param list    设定文件 
	 * @return void    返回类型 
	 * @throws
	 * @author vino     
	 * @date Jan 28, 2015 9:27:53 PM  
	 * @version V1.0
	 */
	public void batchDelete(List<T> list){
		getDao().batchDelete(list);
	}
	
	/**
	 * 查询所有数据，不管是否删除
	 * @Title: queryData 
	 * @Description: TODO(这里用一句话描述这个方法的作用) 
	 * @param @param t
	 * @param @return    设定文件 
	 * @return T    返回类型 
	 * @throws
	 * @author vino     
	 * @date Jan 29, 2015 11:32:32 AM  
	 * @version V1.0
	 */
	public T queryData(T t){
		return getDao().queryData(t);
	}
	
	/**
	 * 根据name查询
	 * @Title: queryByName 
	 * @Description: TODO(这里用一句话描述这个方法的作用) 
	 * @param @param t
	 * @param @return    设定文件 
	 * @return T    返回类型 
	 * @throws
	 * @author vino     
	 * @date Feb 11, 2015 5:52:40 PM  
	 * @version V1.0
	 */
	public T queryByName(String name){
		return getDao().queryByName(name);
	}
	
	/**
	 * 
	 * @Title: queryListByObj 
	 * @Description: TODO(这里用一句话描述这个方法的作用) 
	 * @param @param obj
	 * @param @return    设定文件 
	 * @return List<T>    返回类型 
	 * @throws
	 * @author vino     
	 * @date Mar 4, 2015 1:24:25 PM  
	 * @version V1.0
	 */
	public List<T> queryListByObj(Object obj){
		return getDao().queryListByObj(obj);
	}
	
	/**
	 * 
	 
	  * queryTotalRows(这里用一句话描述这个方法的作用)
	
	  * TODO(这里描述这个方法适用条件 – 可选)
	
	  * TODO(这里描述这个方法的执行流程 – 可选)
	
	  * TODO(这里描述这个方法的使用方法 – 可选)
	
	  * TODO(这里描述这个方法的注意事项 – 可选)
	
	  * @Title: queryTotalRows
	
	  * @Description: TODO
	
	  * @param @param obj
	  * @param @return    设定参数
	
	  * @return Integer    返回类型
	
	  * @throws
	  
	  * @author bo.dang
	  
	  * @date 2015年6月6日 下午4:40:21
	 */
	public Integer queryTotalRows(Object obj){
		return getDao().queryTotalRows(obj);
	}
	
}
