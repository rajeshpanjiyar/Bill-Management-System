package com.billmanagement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.time.LocalTime; 
public class TimeAndDate {
	
	public static void showDate()
	{ 
		System.out.print(java.time.LocalDate.now());
	}
	
	public static  void showTime()
	{
		Calendar now = Calendar.getInstance();
		System.out.print(now.get(Calendar.HOUR_OF_DAY) + ":" + now.get(Calendar.MINUTE));
		
		
	}
	

}
