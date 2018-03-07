package com.zxy.learning.basic;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class TimeBasic {
	public static void main(String[] args){
		Calendar cal = Calendar.getInstance();
		cal.get(Calendar.MONTH);  // 0-11 需要加1;
		
		LocalDateTime dt = LocalDateTime.now();
		dt.getMonthValue(); //1-12;
		
		//日期格式化
		SimpleDateFormat used = new SimpleDateFormat("yyyy-MM-dd");
		Date date = new Date();
		System.out.println(used.format(date));
		
		//java 8 日期格式化
		DateTimeFormatter now = DateTimeFormatter.ofPattern("yyyy-MM-dd");//MM / mm之间区分
		LocalDate date2 = LocalDate.now();
		System.out.println(date2.format(now));
		
	}
}
