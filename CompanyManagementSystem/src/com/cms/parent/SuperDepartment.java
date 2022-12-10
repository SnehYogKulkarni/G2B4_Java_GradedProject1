package com.cms.parent;
import com.cms.interfaces.*;

public class SuperDepartment implements Super_Department{
	
	public String departmentName() {
		return "Super Department";
	}
	
	public String getTodaysWork() {
		return "No Work as of now";
	}
	
	public String getWorkDeadline() {
		return " Nil ";
	}
	
	public  String isTodayAHoliday() {
		
		return " Today is not a holiday";
	}
	

}