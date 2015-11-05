package com.spacex.entity;

import java.util.Date;

/**
 * 
 * @ClassName:BaseEntity.java

 * @Description: 基础实体类

 * @author Vino Dang

 * @date 2015年10月25日

 * @version V1.0
 */
public class BaseEntity {
	/** id */
	private Integer id;
	
	private boolean sx_delete_flag;
	
	private Date sx_create_time;
	
	private String sx_create_by_user_id;
	
	private Date sx_update_time;
	
	private String sx_update_by_user_id;

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the sx_delete_flag
	 */
	public boolean isSx_delete_flag() {
		return sx_delete_flag;
	}

	/**
	 * @param sx_delete_flag the sx_delete_flag to set
	 */
	public void setSx_delete_flag(boolean sx_delete_flag) {
		this.sx_delete_flag = sx_delete_flag;
	}

	/**
	 * @return the sx_create_time
	 */
	public Date getSx_create_time() {
		return sx_create_time;
	}

	/**
	 * @param sx_create_time the sx_create_time to set
	 */
	public void setSx_create_time(Date sx_create_time) {
		this.sx_create_time = sx_create_time;
	}

	/**
	 * @return the sx_create_by_user_id
	 */
	public String getSx_create_by_user_id() {
		return sx_create_by_user_id;
	}

	/**
	 * @param sx_create_by_user_id the sx_create_by_user_id to set
	 */
	public void setSx_create_by_user_id(String sx_create_by_user_id) {
		this.sx_create_by_user_id = sx_create_by_user_id;
	}

	/**
	 * @return the sx_update_time
	 */
	public Date getSx_update_time() {
		return sx_update_time;
	}

	/**
	 * @param sx_update_time the sx_update_time to set
	 */
	public void setSx_update_time(Date sx_update_time) {
		this.sx_update_time = sx_update_time;
	}

	/**
	 * @return the sx_update_by_user_id
	 */
	public String getSx_update_by_user_id() {
		return sx_update_by_user_id;
	}

	/**
	 * @param sx_update_by_user_id the sx_update_by_user_id to set
	 */
	public void setSx_update_by_user_id(String sx_update_by_user_id) {
		this.sx_update_by_user_id = sx_update_by_user_id;
	}



	
}
