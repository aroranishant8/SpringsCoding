package com.example.myproject;

public class EmployeeBean {
	int id;
	String name;
	public EmployeeBean(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	
	public EmployeeBean(int id)
	{
		this.id=id;
	}
	
	public EmployeeBean(String name)
	{
		this.name=name;
	}
	public EmployeeBean()
	{
		System.out.println("def cons");
	}
	
	String show(){  
	    return(id+" "+name);  
	} 

}
