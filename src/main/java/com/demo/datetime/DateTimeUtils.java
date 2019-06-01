package com.demo.datetime;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTimeUtils {
	/**
	 * 获取"yyyyMMdd"格式日期
	 * @return
	 */
	public static String getDate(){
		SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
		return formatter.format(new Date());
	}
	
	/**
	 * 获取年份
	 * @return
	 */
	public static String getYear(){
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy");
		return formatter.format(new Date());
	}
	
	/**
	 * 获取月日
	 * @return
	 */
	public static String getMonDay(){
		SimpleDateFormat formatter = new SimpleDateFormat("MMdd");
		return formatter.format(new Date());
	}
	
	/**
	 * 获取"yyyy-MM-dd HH:mm:ss"格式日期
	 * @return
	 */
	public static String getDate1(){
		SimpleDateFormat df2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return df2.format(new Date());
	}
	
	/**
	 * 获取"yyyyMMddHHmmss"格式日期
	 * @return
	 */
	public static String getDate2(){
		SimpleDateFormat df2 = new SimpleDateFormat("yyyyMMddHHmmss");
		return df2.format(new Date());
	}
	
	/**
	 * 将传入的文件最近修改时间转换为固定时间格式
	 * @param time
	 * @return
	 */
	public static String getFileLastModifyDate(long time){
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		return formatter.format(new Date(time));
	}
	
	/**
	 * 根据传入的days参数，返回days天前的日期
	 * @param days
	 * @return
	 */
	public static String getDateBeforeN(String days){
		Calendar rightnow = Calendar.getInstance();
		rightnow.add(Calendar.DATE,Integer.parseInt("-" + days));
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		return formatter.format(rightnow.getTime());
	}
	

    /**
     * 获取日期年份
     * 
     * @return
     */
    public static int getYear(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(Calendar.YEAR);
    }

    /**
     * 获取日期年份
     * 
     * @return
     */
    public static int getMonth(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(Calendar.MONTH);
    }

    /**
     * 获取日期的天数
     * 
     * @return
     */
    public static int getDay(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(Calendar.DATE);
    }

    /**
     * 毫秒转日期字符串
     *
     * @param str
     * @return
     */
    public static String getDateTimeByMillisecond(String str) { 
       Date date = new Date(Long.valueOf(str));
       SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
       String time = format.format(date);
       return time;
    }
   
     /**
       * 获取当前日期
       *
       * @param 
       * @return yyyyMMdd
       */
     public static String getCurrentDate(){
    	return new SimpleDateFormat("yyyyMMdd").format(new Date(System.currentTimeMillis()));
     }
       
       
     /**
       * 获取当前时间
       *
       * @param 
       * @return yyyyMMdd
       */
    public static String getCurrentTime(){ 
    	return new SimpleDateFormat("HHmmss").format(new Date(System.currentTimeMillis()));
    }
       
    /**
     * 获取当前日期时间
     *
     * @param 
     * @return yyyyMMddHHmmss
     */
    public static String getCurrentDateTime(){
    	return new SimpleDateFormat("yyyyMMddHHmmss").format(new Date(System.currentTimeMillis()));
    }
	
    /**
     * 
     * @param args
     */
	public static void main(String[] args) {
		System.out.println(DateTimeUtils.getDateBeforeN("2"));
	}
	
}
