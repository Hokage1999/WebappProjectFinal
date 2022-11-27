package com.webapps;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.CSVWriter;

public class Cred {
		 String uname;    
		 String pass;
		 String mobileNo;
		 List<String>courses = new ArrayList<>(); //change
		public String getUname() {
			return uname;
		}
		public void setUname(String uname) {
			this.uname = uname;
		}
		public String getPass() {
			return pass;
		}
		public void setPass(String pass) {
			this.pass = pass;
		}
		public String getMobileNo() {
			return mobileNo;
		}
		public void setMobileNo(String mobileNo) {
			this.mobileNo = mobileNo;
		}
		public List<String> getCourses() {
			return courses;
		}
		public void setCourses(List<String> courses) {
			this.courses = courses;
		}
		public Cred(String uname,String pass,String mobileNo) {
			this.uname = uname;
			this.pass = pass;	
			this.mobileNo = mobileNo;
		}
		 static ArrayList<Cred>lis = new ArrayList<>();
		 
		 public void addList(Cred a)
		 {
		 lis.add(a);
		 BeantoCSV.CSV();			//calling this function for bean(object) to csv at the time of object instantiation....
		 }
		 public static List getList()
		 {
			 return lis;
		 }
		
		 public boolean signup(Cred a)
		 {
			 for(int i=0;i<lis.size()-1;i++)
			 {
			 Cred s = lis.get(i);
			 if(uname.equals(s.uname)&& pass.equals(s.pass))
			 {
				 lis.remove(a);
				 BeantoCSV.CSV();
				 return false;
			 }
			 }
			 return true;
		 }
		 
		 public static boolean loginCheck(String name,String pass)
		 {
		 for(Cred x:lis)
			{
				if(x.uname.equals(name)&& x.pass.equals(pass))
				{
					return true;
				}
			}
		 return false;
		 }
		 public static boolean addCourses(String name,String courseName)
		 {
			 for(int i=0;i<lis.size();i++)
				{
					Cred s =lis.get(i);
					if(name.equals(s.uname))
					{
						if(!(s.courses.contains(courseName)))
						{
							s.courses.add(courseName);
							BeantoCSV.CSV();                //calling this function to get the updated courseList....
							return true;
						}
					}
				}
			 return false;
		 }
		 public static void removeCourses(String name,String courseName)
			{
			 for(int i=0;i<lis.size();i++)
				{
					Cred s =lis.get(i);
					if(name.equals(s.uname))
					{
						s.courses.remove(courseName);
						BeantoCSV.CSV(); 
					}
				}
			}
		 public static List<String> returnCourses(String name)
			{
			 for(int i=0;i<lis.size();i++)
				{
					Cred s =lis.get(i);
					if(name.equals(s.uname))
					{
						return s.courses;
					}
				}
			 	return null;
			}
}
