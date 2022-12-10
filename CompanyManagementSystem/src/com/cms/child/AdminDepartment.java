package com.cms.child;
//import com.cms.model.SuperDepartment;
import com.cms.parent.*;

public class AdminDepartment extends SuperDepartment {
	public String departmentName() {
		return " Admin Department ";
	}
	
	public String getTodaysWork() {
		return " Complete your documents Submission ";
	}
	
	public String getWorkDeadline() {
		return " Complete by EOD ";
	}

}
