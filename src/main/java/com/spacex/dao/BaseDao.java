package com.spacex.dao;

import java.util.List;


/**
 * 
 * @ClassName:BaseDao.java

 * @Description: 底层Dao接口

 * @author Vino Dang

 * @date 2015年10月25日

 * @version V1.0
 */
public interface BaseDao<T> {

	
	public Integer insert(T t);
	
	public void update(T t);
	
	public void updateBySelective(T t); 	
	
	public void delete(Object id);
	
	public int queryByCount(T t);
	
	public List<T> queryList(T t);
	
	public T queryObject(T t);
	
	public T queryById(Object obj);
	
	public T queryByPK(Object obj);
	
	public Integer insertList(List<T> list);
	
	public List<T> queryListByObj(Object obj);
	
	/**
	 * 批量更新
	 * @Title: batchUpdate 
	 * @Description: TODO(这里用一句话描述这个方法的作用) 
	 * @param @param list    设定文件 
	 * @return void    返回类型 
	 * @throws
	 * @author vino     
	 * @date Jan 28, 2015 9:26:09 PM  
	 * @version V1.0
	 */
	public void batchUpdate(List<T> list);
	/**
	 * 批量删除
	 * @Title: batchDelete 
	 * @Description: TODO(这里用一句话描述这个方法的作用) 
	 * @param @param list    设定文件 
	 * @return void    返回类型 
	 * @throws
	 * @author vino     
	 * @date Jan 28, 2015 9:23:44 PM  
	 * @version V1.0
	 */
	public void batchDelete(List<T> list);
	
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
	public T queryData(T t);
	
	/**
	 * 根据name来查询数据
	 * @Title: queryByName 
	 * @Description: TODO(这里用一句话描述这个方法的作用) 
	 * @param @param t
	 * @param @return    设定文件 
	 * @return T    返回类型 
	 * @throws
	 * @author vino     
	 * @date Feb 11, 2015 5:46:55 PM  
	 * @version V1.0
	 */
	public T queryByName(Object obj);
	
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
	  
	  * @date 2015年6月6日 下午4:25:33
	 */
	public Integer queryTotalRows(Object obj);
	
}
