package com.webapps;

import java.util.ArrayList;
import java.util.List;

public class AdminCourses {
	static List<String> adminCourses = new ArrayList<>();
	public static boolean adminAddCourses(String courseName)
	{
		if(!(adminCourses.contains(courseName)||Courses.defaultCourses.contains(courseName)))
		{
			adminCourses.add(courseName);
			return true;
		}
		else
		{
		return false;
		}
	}
	public static boolean removeAdminCourses(String courseName)
	{
		if(adminCourses.contains(courseName))
		{
			adminCourses.remove(courseName);
			return true;
		}
		else
		{
		return false;
		}
	}
	public static List returnAdminCourses()
	{
		return adminCourses;
	}
}


