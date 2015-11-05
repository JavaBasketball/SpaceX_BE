package com.spacex.entity;

/**
 * 
 * @ClassName:SpaceXBusiness.java

 * @Description: 店铺实体类

 * @author Vino Dang

 * @date 2015年10月25日

 * @version V1.0
 */
public class SpaceXBusiness extends BaseEntity {
	/** 商户ID */
	private Integer business_id;
	/** 商户名 */
	private String name;
	/** 分店名 */
	private String branch_name;
	/** 地址 */
	private String address;
	/** 带区号的电话 */
	private String telephone;
	/** 所在城市 */
	private Integer city_id;
	/** 纬度坐标 */
	private Float latitude;
	/** 经度坐标 */
	private Float longitude;
	/** 星级评分，5.0代表五星，4.5代表四星半，依此类推 */
	private Float avg_rating;
	/** 星级图片链接 */
	private String rating_img_url;
	/** 小尺寸星级图片链接 */
	private String rating_s_img_url;
	/** 产品/食品口味评价，1:一般，2:尚可，3:好，4:很好，5:非常好 */
	private Integer product_grade;
	/** 环境评价，1:一般，2:尚可，3:好，4:很好，5:非常好 */
	private Integer decoration_grade;
	/** 服务评价，1:一般，2:尚可，3:好，4:很好，5:非常好 */
	private Integer service_grade;
	/** 产品/食品口味评价单项分，精确到小数点后一位（十分制） */
	private Float product_score;
	/** 环境评价单项分，精确到小数点后一位（十分制） */
	private Float decoration_score;
	/** 服务评价单项分，精确到小数点后一位（十分制） */
	private Float service_score;
	/** 人均价格，单位:元，若没有人均，返回-1 */
	private Integer avg_price;
	/** 点评数量 */
	private Integer review_count;
	/** 商户页面链接 */
	private String business_url;
	/** 照片链接，照片最大尺寸700×700 */
	private String photo_url;
	/** 小尺寸照片链接，照片最大尺寸278×200 */
	private String s_photo_url;
	/** 照片数量 */
	private Integer photo_count;
	/** 是否有优惠券，0:没有，1:有 */
	private Integer has_coupon;
	/** 优惠券ID */
	private Integer coupon_id;
	/** 优惠券描述 */
	private String coupon_description;
	/** 优惠券页面链接 */
	private String coupon_url;
	/** 是否有团购，0:没有，1:有 */
	private Integer has_deal;
	/** 商户当前在线团购数量 */
	private Integer deal_count;
	/** 是否有在线预订，0:没有，1:有 */
	private Integer has_online_reservation;
	/** 在线预订页面链接，目前仅返回HTML5站点链接 */
	private String online_reservation_url;
	/** 特点 */
	private String specialties;
	/** 推荐菜 */
	private String popular_dishes;
	/** 商区Id */
	private Integer region_id;

	/**
	 * @return the business_id
	 */
	public Integer getBusiness_id() {
		return business_id;
	}

	/**
	 * @param business_id
	 *            the business_id to set
	 */
	public void setBusiness_id(Integer business_id) {
		this.business_id = business_id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the branch_name
	 */
	public String getBranch_name() {
		return branch_name;
	}

	/**
	 * @param branch_name
	 *            the branch_name to set
	 */
	public void setBranch_name(String branch_name) {
		this.branch_name = branch_name;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address
	 *            the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the telephone
	 */
	public String getTelephone() {
		return telephone;
	}

	/**
	 * @param telephone
	 *            the telephone to set
	 */
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	/**
	 * @return the latitude
	 */
	public Float getLatitude() {
		return latitude;
	}

	/**
	 * @param latitude
	 *            the latitude to set
	 */
	public void setLatitude(Float latitude) {
		this.latitude = latitude;
	}

	/**
	 * @return the longitude
	 */
	public Float getLongitude() {
		return longitude;
	}

	/**
	 * @param longitude
	 *            the longitude to set
	 */
	public void setLongitude(Float longitude) {
		this.longitude = longitude;
	}

	/**
	 * @return the avg_rating
	 */
	public Float getAvg_rating() {
		return avg_rating;
	}

	/**
	 * @param avg_rating
	 *            the avg_rating to set
	 */
	public void setAvg_rating(Float avg_rating) {
		this.avg_rating = avg_rating;
	}

	/**
	 * @return the rating_img_url
	 */
	public String getRating_img_url() {
		return rating_img_url;
	}

	/**
	 * @param rating_img_url
	 *            the rating_img_url to set
	 */
	public void setRating_img_url(String rating_img_url) {
		this.rating_img_url = rating_img_url;
	}

	/**
	 * @return the rating_s_img_url
	 */
	public String getRating_s_img_url() {
		return rating_s_img_url;
	}

	/**
	 * @param rating_s_img_url
	 *            the rating_s_img_url to set
	 */
	public void setRating_s_img_url(String rating_s_img_url) {
		this.rating_s_img_url = rating_s_img_url;
	}

	/**
	 * @return the product_grade
	 */
	public Integer getProduct_grade() {
		return product_grade;
	}

	/**
	 * @param product_grade
	 *            the product_grade to set
	 */
	public void setProduct_grade(Integer product_grade) {
		this.product_grade = product_grade;
	}

	/**
	 * @return the decoration_grade
	 */
	public Integer getDecoration_grade() {
		return decoration_grade;
	}

	/**
	 * @param decoration_grade
	 *            the decoration_grade to set
	 */
	public void setDecoration_grade(Integer decoration_grade) {
		this.decoration_grade = decoration_grade;
	}

	/**
	 * @return the service_grade
	 */
	public Integer getService_grade() {
		return service_grade;
	}

	/**
	 * @param service_grade
	 *            the service_grade to set
	 */
	public void setService_grade(Integer service_grade) {
		this.service_grade = service_grade;
	}

	/**
	 * @return the product_score
	 */
	public Float getProduct_score() {
		return product_score;
	}

	/**
	 * @param product_score
	 *            the product_score to set
	 */
	public void setProduct_score(Float product_score) {
		this.product_score = product_score;
	}

	/**
	 * @return the decoration_score
	 */
	public Float getDecoration_score() {
		return decoration_score;
	}

	/**
	 * @param decoration_score
	 *            the decoration_score to set
	 */
	public void setDecoration_score(Float decoration_score) {
		this.decoration_score = decoration_score;
	}

	/**
	 * @return the service_score
	 */
	public Float getService_score() {
		return service_score;
	}

	/**
	 * @param service_score
	 *            the service_score to set
	 */
	public void setService_score(Float service_score) {
		this.service_score = service_score;
	}

	/**
	 * @return the avg_price
	 */
	public Integer getAvg_price() {
		return avg_price;
	}

	/**
	 * @param avg_price
	 *            the avg_price to set
	 */
	public void setAvg_price(Integer avg_price) {
		this.avg_price = avg_price;
	}

	/**
	 * @return the review_count
	 */
	public Integer getReview_count() {
		return review_count;
	}

	/**
	 * @param review_count
	 *            the review_count to set
	 */
	public void setReview_count(Integer review_count) {
		this.review_count = review_count;
	}

	/**
	 * @return the business_url
	 */
	public String getBusiness_url() {
		return business_url;
	}

	/**
	 * @param business_url
	 *            the business_url to set
	 */
	public void setBusiness_url(String business_url) {
		this.business_url = business_url;
	}

	/**
	 * @return the photo_url
	 */
	public String getPhoto_url() {
		return photo_url;
	}

	/**
	 * @param photo_url
	 *            the photo_url to set
	 */
	public void setPhoto_url(String photo_url) {
		this.photo_url = photo_url;
	}

	/**
	 * @return the s_photo_url
	 */
	public String getS_photo_url() {
		return s_photo_url;
	}

	/**
	 * @param s_photo_url
	 *            the s_photo_url to set
	 */
	public void setS_photo_url(String s_photo_url) {
		this.s_photo_url = s_photo_url;
	}

	/**
	 * @return the photo_count
	 */
	public Integer getPhoto_count() {
		return photo_count;
	}

	/**
	 * @param photo_count
	 *            the photo_count to set
	 */
	public void setPhoto_count(Integer photo_count) {
		this.photo_count = photo_count;
	}

	/**
	 * @return the has_coupon
	 */
	public Integer getHas_coupon() {
		return has_coupon;
	}

	/**
	 * @param has_coupon
	 *            the has_coupon to set
	 */
	public void setHas_coupon(Integer has_coupon) {
		this.has_coupon = has_coupon;
	}

	/**
	 * @return the coupon_id
	 */
	public Integer getCoupon_id() {
		return coupon_id;
	}

	/**
	 * @param coupon_id
	 *            the coupon_id to set
	 */
	public void setCoupon_id(Integer coupon_id) {
		this.coupon_id = coupon_id;
	}

	/**
	 * @return the coupon_description
	 */
	public String getCoupon_description() {
		return coupon_description;
	}

	/**
	 * @param coupon_description
	 *            the coupon_description to set
	 */
	public void setCoupon_description(String coupon_description) {
		this.coupon_description = coupon_description;
	}

	/**
	 * @return the coupon_url
	 */
	public String getCoupon_url() {
		return coupon_url;
	}

	/**
	 * @param coupon_url
	 *            the coupon_url to set
	 */
	public void setCoupon_url(String coupon_url) {
		this.coupon_url = coupon_url;
	}

	/**
	 * @return the has_deal
	 */
	public Integer getHas_deal() {
		return has_deal;
	}

	/**
	 * @param has_deal
	 *            the has_deal to set
	 */
	public void setHas_deal(Integer has_deal) {
		this.has_deal = has_deal;
	}

	/**
	 * @return the deal_count
	 */
	public Integer getDeal_count() {
		return deal_count;
	}

	/**
	 * @param deal_count
	 *            the deal_count to set
	 */
	public void setDeal_count(Integer deal_count) {
		this.deal_count = deal_count;
	}

	/**
	 * @return the has_online_reservation
	 */
	public Integer getHas_online_reservation() {
		return has_online_reservation;
	}

	/**
	 * @param has_online_reservation
	 *            the has_online_reservation to set
	 */
	public void setHas_online_reservation(Integer has_online_reservation) {
		this.has_online_reservation = has_online_reservation;
	}

	/**
	 * @return the online_reservation_url
	 */
	public String getOnline_reservation_url() {
		return online_reservation_url;
	}

	/**
	 * @param online_reservation_url
	 *            the online_reservation_url to set
	 */
	public void setOnline_reservation_url(String online_reservation_url) {
		this.online_reservation_url = online_reservation_url;
	}

	/**
	 * @return the specialties
	 */
	public String getSpecialties() {
		return specialties;
	}

	/**
	 * @param specialties
	 *            the specialties to set
	 */
	public void setSpecialties(String specialties) {
		this.specialties = specialties;
	}

	/**
	 * @return the popular_dishes
	 */
	public String getPopular_dishes() {
		return popular_dishes;
	}

	/**
	 * @param popular_dishes
	 *            the popular_dishes to set
	 */
	public void setPopular_dishes(String popular_dishes) {
		this.popular_dishes = popular_dishes;
	}

	/**
	 * @return the region_id
	 */
	public Integer getRegion_id() {
		return region_id;
	}

	/**
	 * @param region_id
	 *            the region_id to set
	 */
	public void setRegion_id(Integer region_id) {
		this.region_id = region_id;
	}

	/**
	 * @return city_id
	 */

	public Integer getCity_id() {
		return city_id;
	}

	/**
	 * @param city_id
	 *            the city_id to set
	 */

	public void setCity_id(Integer city_id) {
		this.city_id = city_id;
	}

}
