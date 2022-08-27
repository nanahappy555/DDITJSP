package com.jsp.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;


public class TestListener implements ServletContextListener {

    public void contextDestroyed(ServletContextEvent arg0)  { 
         // TODO Auto-generated method stub
    }

    public void contextInitialized(ServletContextEvent event)  { 
         ServletContext ctx = event.getServletContext();
         String message=ctx.getInitParameter("message");
         System.out.println(message);
    }
	
}
