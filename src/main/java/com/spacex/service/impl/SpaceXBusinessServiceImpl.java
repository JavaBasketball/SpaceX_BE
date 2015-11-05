package com.spacex.service.impl;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.poi.ss.formula.functions.T;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spacex.constant.CommonConstants;
import com.spacex.dao.SpaceXBusinessDao;
import com.spacex.model.SpaceXBusinessModel;
import com.spacex.service.SpaceXBusinessService;
import com.spacex.util.JsonUtil;
import com.spacex.util.PageUtil;
import com.spacex.util.StringUtil;

/**
 * 
 * @ClassName:SpaceXBusinessServiceImpl.java

 * @Description: 店铺Service

 * @author Vino Dang

 * @date 2015年10月25日

 * @version V1.0
 */
@Path("/SpaceXBusinessServiceImpl")
@Service("SpaceXBusinessServiceImpl")
public class SpaceXBusinessServiceImpl extends BaseService implements SpaceXBusinessService {
	@Autowired
	private SpaceXBusinessDao<T> spaceXBusinessDao;
	@Override
	public SpaceXBusinessDao<T> getDao() {
		// TODO Auto-generated method stub
		return spaceXBusinessDao;
	}

	@GET
	@Path("selectAutoComplete")
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML, MediaType.APPLICATION_FORM_URLENCODED})
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML, MediaType.APPLICATION_FORM_URLENCODED})
	public Response selectAutoComplete(@QueryParam("keyWord") String keyWord){
/*		@SuppressWarnings("unchecked")
		Map<String,Object> infoMap = JsonUtil.toHashMap(searchStr);
		String keyWord = infoMap.get("keyWord").toString();*/
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("keyWord", keyWord);
		paramMap.put("auto_complete_num", CommonConstants.AUTO_COMPLETE_NUM);
		
		List<SpaceXBusinessModel> nameList = spaceXBusinessDao.selectAutoComplete(paramMap);
		// TODO Auto-generated method stub
		return Response.status(Response.Status.OK)
				// 200
						.entity(nameList).build();
	}
	
	
	@SuppressWarnings("unchecked")
	@GET
	@Path("selectBusinessList")
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML,  MediaType.APPLICATION_FORM_URLENCODED })
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML,  MediaType.APPLICATION_FORM_URLENCODED})
	public Response selectBusinessList(
			@QueryParam("keyWord") String keyWord,
			@QueryParam("selectedName") String selectedName,
			@QueryParam("currentPage") int currentPage,
			@QueryParam("pageSize") int pageSize
			) {
		
/*		Integer currentPage = 1;
	    Integer pageSize = 4;
	    String keyWord = "";
		if(StringUtil.isNotNull(info)){
			Map<String,Object> infoMap = JsonUtil.toHashMap(info);
			currentPage = infoMap.get("currentPage") == null ? 1 : Integer.parseInt(infoMap.get("currentPage").toString());
			pageSize = infoMap.get("pageSize") == null ? 4 : Integer.parseInt(infoMap.get("pageSize").toString());
			
			keyWord = infoMap.get("keyWord").toString();
			
		}*/
		if(currentPage == 0){
			currentPage = 1;
		}
		if(pageSize == 0){
			pageSize = 4;
		}
		if(StringUtil.isNull(keyWord)){
			keyWord = "";
		}

		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("selectedName", selectedName);
		paramMap.put("keyWord", keyWord);

		/*
		 * paramMap.put("CRMCustomerInfo", crmDetailModel);
		 * paramMap.put("CRMLinkManInfo", crmLinkManInfo);
		 * paramMap.put("CRMFollowUpRecsServReq", crmFollowUpRecsServReq);
		 */
		// 总行数
		Integer totalRows = spaceXBusinessDao.queryTotalRows(paramMap);

		// 分页处理
		PageUtil page = new PageUtil(totalRows, currentPage, pageSize);

		paramMap.put("startRow", page.getStartRow());
		paramMap.put("pageSize", pageSize);
		
		List<T> modelList = spaceXBusinessDao.queryListByObj(paramMap);
		// TODO Auto-generated method stub
		return Response.status(Response.Status.OK)
				// 200
						.entity(modelList).build();
	}
}
