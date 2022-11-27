package com.webapps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Courses {
	static List<String> courses = new ArrayList<>();
	static String[] arr = {"JAVA","PYTHON","C","C++"};
	static List<String> defaultCourses = Arrays.asList(arr);
	
	
	public static List<String> defaultCourses()
	{
		return defaultCourses;
	}

}
