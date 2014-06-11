package org.daniels.expenses.service.impl;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.daniels.expenses.dao.PersonDao;
import org.daniels.expenses.service.PersonManager;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

public class CalServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        ApplicationContext ac = WebApplicationContextUtils.getRequiredWebApplicationContext(getServletContext());

        response.getWriter().print("Some text: " + ac != null);
        PersonDao personDao = (PersonDao) ac.getBean("personDao");
        System.out.println("personDao: " + personDao.getAll());
        response.getWriter().print("Person list: " + personDao.getAll());
        
        
        PersonManager personManager = (PersonManager) ac.getBean("personManager");
        if (personManager != null){
        	response.getWriter().print("Person Manager is available !!\n");
        	response.getWriter().print("Person list from manager: " + personManager.getPeople());
        }
        else{
        	response.getWriter().print("Person Manager NOT available !!!");
        }
        
        response.getWriter().close();
    }
}