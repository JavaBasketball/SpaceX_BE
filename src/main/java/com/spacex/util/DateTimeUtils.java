package com.spacex.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Hashtable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * 
 
  * @ClassName: DateTimeUtils

  * @Description: 日期时间工具类，提供日期的运算，转换等函数

  * @author Vino Dang

  * @date 2015年6月1日 下午2:59:34

  * @version V1.0
 */
final public class DateTimeUtils {
	private static Logger logger = LoggerFactory.getLogger(DateTimeUtils.class);
    final static public String YYYY_MM_DD = "yyyy-MM-dd";
	final static public String YYYY_MM_DD_HH_MM_ss = "yyyy-MM-dd HH:mm:ss";
	final static public String HH_MM_ss = "HH:mm:ss";
	final static public String YYYYMMDD = "yyyyMMdd";
	final static public String YYYYMMDDHHMMSS = "yyyyMMddHHmmss";
	final static public String HHMMss = "HHmmss";

	final static public SimpleDateFormat DateFormater = new SimpleDateFormat(
			"yyyy-MM-dd");

	final static public SimpleDateFormat TimeFormater = new SimpleDateFormat(
			"HH:mm:ss");

	final static public SimpleDateFormat DateTimeFormater = new SimpleDateFormat(
			"yyyy-MM-dd HH:mm:ss");

	final static private Hashtable<String, SimpleDateFormat> CustomFormats = new Hashtable<String, SimpleDateFormat>();

	final static private String[] DaysOfWeek = new String[] { "星期一", "星期二",
			"星期三", "星期四", "星期五", "星期六", "星期天" };

	final static private ThreadLocal<Long> threadTimes = new ThreadLocal<Long>();
	/**
	 * 时间单位定义。依次为毫秒，秒，分钟，小时，天，月，年，世纪
	 */
	final static private String[] TIME_UNIT ={"ms","ss","mm","hh","dd","MM","yy","cc"};
	/**
	 * @desc 返回当前日期，如2011-6-12
	 * @date 2011-6-7
	 * @return 返回当前日期
	 */
	static public String currentDate() {
		return DateFormater.format(new Date());
	}

	/**
	 *  返回当前时间，如 12:01:23
	 * @date 2011-6-7
	 * @return 返回当前时间字符串。
	 */
	static public String currentTime() {
		return TimeFormater.format(new Date());
	}

	/**
	 * 如 2011-6-12 12:01:23
	 * @date 2011-6-7
	 * @return 返回当前日期时间
	 */
	static public String currentDateTime() {
		return DateTimeFormater.format(new Date());
	}

	/**
	 *  依据给定的格式，返回当前日期时间
	 * @date 2011-6-7
	 * @param format
	 * @return
	 */
	static public String currentDateTime(String format) {
		try {
			synchronized (CustomFormats) {
				if (!CustomFormats.containsKey(format)) {
					CustomFormats.put(format, new SimpleDateFormat(format));
				}
			}

			SimpleDateFormat formater = CustomFormats.get(format);

			return formater.format(new Date());
		} catch (Exception ex) {
			throw new RuntimeException("no exsits formater: " + format, ex);
		}
	}

	/**
	 *  返回当前日期是一周的哪一天
	 * @date 2011-6-7
	 * @return
	 */
	static public String weekOfDay() {
		return weekOfDay(Calendar.getInstance());
	}

	/**
	 * 返回给定日期是一周的哪一天
	 * @date 2011-6-7
	 * @param date
	 * @return 返回周一，周二...
	 */
	static public String weekOfDay(Calendar date) {
		return DaysOfWeek[date.get(Calendar.DAY_OF_WEEK) - 1];
	}

	/**
	 * 格式化给定日期。
	 * @date 2011-6-7
	 * @param date
	 * @return 返回 YYYY-MM-DD HH:mm:ss
	 */
	static public String customDateTime(Date date) {
		if(date!=null)
			return DateTimeFormater.format(date);
		else
			return null;
	}

	/**
	 * 用指定的日期格式格式化指定的日期
	 * @date 2011-6-7
	 * @param time
	 *            给定的日期
	 * @param format
	 *            给定的格式
	 * @return 日期字符串
	 */
	static public String customDateTime(Date time, String format) {
		try {
			synchronized (CustomFormats) {
				if (!CustomFormats.containsKey(format)) {
					CustomFormats.put(format, new SimpleDateFormat(format));
				}
			}

			SimpleDateFormat formater = CustomFormats.get(format);

			return formater.format(time);
		} catch (Exception ex) {
			throw new RuntimeException("no exsits formater: " + format, ex);
		}
	}
	/**
	 * 用指定的日历格式格式化指定的日期
	 * @date 2012-9-29
	 * @param time 日历
	 * @param format 日期格式
	 * @return 日期字符串
	 */
	static public String customDateTime(Calendar time, String format) {
		try {
			synchronized (CustomFormats) {
				if (!CustomFormats.containsKey(format)) {
					CustomFormats.put(format, new SimpleDateFormat(format));
				}
			}

			SimpleDateFormat formater = CustomFormats.get(format);

			return formater.format(time);
		} catch (Exception ex) {
			throw new RuntimeException("no exsits formater: " + format, ex);
		}
	}

	/**
	 *  将yyyy-MM-dd HH:mm:ss格式的日期字符串转换为日期
	 * @date 2011-6-7
	 * @param datetime 输入的日期字符串
	 * @return 返回日期
	 */
	static public Date parserDateTime(String datetime) {
		try {
			return DateTimeFormater.parse(datetime);
		} catch (ParseException ex) {
			throw new RuntimeException("给定的日期时间字符串不正确，正确格式为：yyyy-MM-dd HH:mm:ss", ex);
		}
	}
	

	/**
	 * 将指定格式的日期字符串转换为日期
	 * @date 2011-6-7
	 * @param datetime
	 *            输入的日期字符串
	 * @param format
	 *            输入的日期格式
	 * @return 返回日期
	 */
	static public Date parserDateTime(String datetime, String format) {
		try {
			synchronized (CustomFormats) {
				if (!CustomFormats.containsKey(format)) {
					CustomFormats.put(format, new SimpleDateFormat(format));
				}
			}

			SimpleDateFormat formater = CustomFormats.get(format);

			return formater.parse(datetime);
		} catch (Exception ex) {
			throw new RuntimeException("format failed: " + format+" dateStr:"+datetime);
		}
	}
	/**
	 * 将日期字符串用指定的格式转换成另一个日期字符串。
	 * @date 2011-10-20 
	 * @param time 将yyyy-MM-dd HH:mm:ss格式的日期字符串转换为日期
	 * @param format 指定的输出日期格式。
	 * @return 转换后的字符串
	 */
	static public String convert(String time, String format) {
		return customDateTime(parserDateTime(time), format);
	}
	/**
	 * 将指定格式的日期字符串转换成另一个指定格式的日期字符串。
	 * @date 2011-10-20 
	 * @param time 输入的日期字符串
	 * @param oformat 输入的日期字符串格式 如yyyy-MM-dd HH:mm:ss
	 * @param nformat 待转换的日期格式 如yyyy-MM-dd
	 * @return  转换后的字符串
	 */
	static public String convert(String time, String oformat, String nformat) {
		return customDateTime(parserDateTime(time, oformat), nformat);
	}
	/**
	 * 计算指定日期和当前日期之间的时间差，单位为毫秒
	 * @date 2012-9-29
	 * @param time 指定的日期
	 * @return 指定日期和当前日期之间的时间差，单位为毫秒
	 */
	static public long timeDiff(String time) {
		return parserDateTime(time).getTime() - new Date().getTime();
	}
	/**
	 * 计算指定日期和当前日期之间的时间差，单位为毫秒
	 * @date 2012-9-29
	 * @param time 指定的日期
	 * @param format 指定日期的格式
	 * @return 指定日期和当前日期之间的时间差，单位为毫秒
	 */
	static public long timeDiff(String time, String format) {
		return parserDateTime(time, format).getTime() - new Date().getTime();
	}
	/**
	 * 计算两个日期之间的时间差，计算方式为a-b
	 * @date 2012-9-29
	 * @param atime 第一个日期
	 * @param btime 第二个日期
	 * @param format 日期格式
	 * @return 时间差，单位为毫秒
	 */
	static public long timeDiff(String atime, String btime, String format) {
		return parserDateTime(atime, format).getTime()
				- parserDateTime(btime, format).getTime();
	}
	/**
	 * 计算两个日期之间的时间差，计算方式为a-b
	 * @date 2012-9-29
	 * @param atime 第一个日期
	 * @param aformat 第一个日期格式
	 * @param btime 第二个日期
	 * @param bformat 第二个日期格式
	 * @return 时间差，单位为毫秒
	 */
	static public long timeDiff(String atime, String aformat, String btime,
			String bformat) {
		return parserDateTime(atime, aformat).getTime()
				- parserDateTime(btime, bformat).getTime();
	}
	
	
	/**
	 * 添加时间
	 * @param date
	 * @param seconds
	 * @return
	 */
    public static Date addDateSeconds(Date date, long seconds){
	   
	   Date newDate = new Date(date.getTime() + seconds);
	   return newDate;
   }

	/**
	 * 比较两个时间的大小
	 * @param date1
	 * @param date2
	 * @return
	 */
	public static boolean compare2Date(Date date1, Date date2){
		if(StringUtil.isNull(date1) || StringUtil.isNull(date2)){
			logger.error("compare2Date: date1 is null or date2 is null");
			return false;
		}
		if(date1.after(date2)){
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		Date date1 = new Date();
		Date date2 = addDateSeconds(date1, 60 * 1000);
		System.out.println(compare2Date(date1, date2));
	}
	
	/**
	 *  将毫秒数换算成x天x时x分x秒x毫秒
	 * @date 2011-3-31
	 * @param ms 毫秒
	 * @return x天x时x分x秒x毫秒
	 */
	public static String formatDHMS(long ms) {
		int ss = 1000;
		int mi = ss * 60;
		int hh = mi * 60;
		int dd = hh * 24;

		long day = ms / dd;
		long hour = (ms - day * dd) / hh;
		long minute = (ms - day * dd - hour * hh) / mi;
		long second = (ms - day * dd - hour * hh - minute * mi) / ss;
		long milliSecond = ms - day * dd - hour * hh - minute * mi - second
				* ss;

		String strDay = day < 10 ? "" + day : "" + day;
		String strHour = hour < 10 ? "0" + hour : "" + hour;
		String strMinute = minute < 10 ? "0" + minute : "" + minute;
		String strSecond = second < 10 ? "0" + second : "" + second;
		String strMilliSecond = milliSecond < 10 ? "0" + milliSecond : ""
				+ milliSecond;
		strMilliSecond = milliSecond < 100 ? "0" + strMilliSecond : ""
				+ strMilliSecond;
		return strDay + "天," + strHour + "小时" + strMinute + "分" + strSecond +"秒"+strMilliSecond+"毫秒";
	}
	
	
	
	
/*	*//**
	 * 用毫秒数计算出{"毫秒","秒","分钟","小时","天","月","年","世纪"}，使用指定的模板格式化成字符串。
	 * 模板取值变量名是下列之一{"ms","ss","mm","hh","dd","MM","yy","cc"}。
	 * @date 2011-3-31
	 * @param time 毫秒
	 * @param format 格式化字符串，如 “用时：{cc}世纪、{yy}年、{MM}月、 {dd}天、{hh}小时、{mm}分钟、{ss}秒、{ms}毫秒”。
	 * @param maxUnit 计算的最大单位。例如设置最大单位为yy,即计算最大年的单位以及年以下的单位 ，所有大于年之后的单位将不会被转换。
	 * @return 格式化之后的字符串。
	 *//*
	public static String formatDHMS(String time,String maxUnit,String format){
		if(ValidateUtils.isNumeric(time)){
			long t = Long.parseLong(time);
			return formatDHMS(t,maxUnit, format);
		}else{
			return null;
		}
	}*/
/*	*//**
	 * 用毫秒数计算出{"毫秒","秒","分钟","小时","天","月","年","世纪"}，使用指定的模板格式化成字符串。
	 * 模板取值变量名是下列之一{"ms","ss","mm","hh","dd","MM","yy","cc"}。
	 * @date 2011-3-31
	 * @param time 待转换的毫秒数
	 * @param format 格式化字符串，如 “用时：{cc}世纪、{yy}年、{MM}月、 {dd}天、{hh}小时、{mm}分钟、{ss}秒、{ms}毫秒”。
	 * @param maxUnit 计算的最大单位。例如设置最大单位为yy,即计算最大年的单位以及年以下的单位 ，所有大于年之后的单位将不会被转换。
	 * @return 格式化之后的字符串。
	 *//*
	public static String formatDHMS(long time,String maxUnit,String format) {
		long[] outArray= getDHMS(time,maxUnit);
		String tmp = format;
		if(!ValidateUtils.isEmpty(format)){
			Matcher matcher = Pattern.compile("\\{(.*?)\\}").matcher(format);
			while(matcher.find()){
				String key = matcher.group(0);	// {秒}
				String mKey= matcher.group(1);	// 秒
				for(int i=0;i<outArray.length;i++){
					if(TIME_UNIT[i].equals(mKey)){
						tmp = tmp.replace(key, outArray[i]+"");
						break;
					}
				}
			}
		}else{
			return null;
		}
		
		return tmp;
	}*/
/*	*//**
	 * 取毫秒转换成多少秒，多少分，多少小时，多少月等。
	 * @date 2013-1-15
	 * @param time 待转换的毫秒
	 * @param maxUnit 最大的转换单位
	 * @return "ms","ss","mm","hh","dd","MM","yy","cc" 的数组。
	 *//*
	public static long[] getDHMS(long time,String maxUnit) {
		
		 * 设定进制 "ms","ss","mm","hh","dd","MM","yy","cc"
		 * 每个单位的进制，比如 毫秒进到秒是1000，秒进到分钟是60，依此类推。
		 * 注意如果计算月的进制就比较麻烦，每个月的天数是不固定的。如果要输出月数，一般取30，做近似月数。
		 * 比如，这个时间长度差不多两个月，每个月用30天表示。
		 * 更改进制数组f的长度，即可以控制计算输出的长度。
		 
		int max =CollectionUtils.search(TIME_UNIT, maxUnit);		// 最大输出位置
		int[] f={1000,60,60,24,30,24,100};		//{"毫秒","秒","分钟","小时","天","月","年","世纪"}的进制;
		long[] outArray= new long[max+1];		// 输出数组。
		long lev = time;
		for(int i=0;i<max;i++){
			outArray[i] = lev % f[i];	// 取每一单位的余数。
			lev = lev / f[i]; 	// 取商。
			if(lev==0) break;
		}
		outArray[max]=lev;
		return outArray;
	}*/
/*	*//**
	 * 取第一个时间和第二个时间的时间间隔.以两时间的最大单位表示.
	 * @date 2013-1-15
	 * @param date1 起始日期
	 * @param date2 结束日期
	 * @param timeUnits 时间单位,以逗号隔开,如 "毫秒,秒,分钟,小时,天,月,年,世纪" 或者 "毫秒前,秒前,分钟前,小时前,天前,月前,年前,世纪前"
	 * @return 最大的时间单位 ,如 2小时.
	 *//*
	public static String getPassedDate(Date date1,Date date2,String timeUnits){
		String ret ="";
		long time = date2.getTime()-date1.getTime();
		String[] timeUnit=timeUnits.split("\\,");
		long[] times = cn.com.jsoft.jframe.utils.DateTimeUtils.getDHMS(time, "yy");
		for(int i=times.length-1;i>=0;i--){
			if(times[i]>0){
				ret = times[i]+timeUnit[i];
				break;
			}
		}
		return ret ;
	}*/
/*	*//**
	 * 取第一个时间和第二个时间的时间间隔.两时间的最大单位表示.
	 * @date 2013-1-15
	 * @param date1 起始日期
	 * @param date2 结束日期
	 * @param timeUnits 时间单位,以逗号隔开,如 "毫秒,秒,分钟,小时,天,月,年,世纪" 或者 "毫秒前,秒前,分钟前,小时前,天前,月前,年前,世纪前"
	 * @return 最大的时间单位 ,如 2小时.
	 *//*
	public static String getPassedDate(String date1,String date2,String timeUnits){
		Date d1 = parserDateTime(date1);
		Date d2 = parserDateTime(date2);
		return getPassedDate(d1, d2, timeUnits);
	}
	public static void main(String[] args) {
		System.out.println(formatDHMS(9000015L));
		System.out.println(formatDHMS(9000015L,"mm","用时：{cc}世纪、{yy}年、{MM}月、 {dd}天、{hh}小时、{mm}分钟、{ss}秒、{ms}毫秒"));
		String timeUnits="毫秒前,秒前,分钟前,小时前,天前,月前,年前,世纪前";
		Date date1= new Date();
		Date date2 =new Date(date1.getTime()+9000015L);
		System.out.println(getPassedDate(date1, date2, timeUnits));
	}*/
	
	/*
	 * 给日期增加n天
	 */
	public static Date addSomeDay(Date date,int n) {
	     Calendar   calendar   =   new   GregorianCalendar(); 
	     calendar.setTime(date); 
	     calendar.add(calendar.DATE,1);//把日期往后增加一天.整数往后推,负数往前移动 
	     date=calendar.getTime();  
	     return date;
	}
}
