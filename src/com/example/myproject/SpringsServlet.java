package com.example.myproject;

import java.io.IOException;
import javax.servlet.http.*;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@SuppressWarnings("serial")
public class SpringsServlet extends HttpServlet 

{
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/plain");
		resp.getWriter().println("Hello, world");
		
		BeanFactory bf=null;
		
		EmployeeBean eb=(EmployeeBean)bf.getBean("onlyint");
		String s=eb.show();
		resp.getWriter().println(s);
		
		
	}
}
