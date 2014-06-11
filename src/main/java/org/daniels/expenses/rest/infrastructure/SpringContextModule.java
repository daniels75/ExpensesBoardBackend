package org.daniels.expenses.rest.infrastructure;

import org.daniels.expenses.dao.PersonDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.google.inject.spring.SpringIntegration;
import com.google.inject.AbstractModule;

//other imports...
public class SpringContextModule extends AbstractModule {
	@Override
	protected void configure() {
		System.out.println("=====================================================");
		System.out.println("=====================================================");
		System.out.println("=====================================================");
		System.out.println("=====================================================");
		System.out.println("=====================================================");
		System.out.println("=====================================================");
		System.out.println("=====================================================");
		System.out.println("=====================================================");
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(new String [] {
		        "classpath*:/applicationContext.xml",
		        "classpath:/applicationContext-dao.xml",
		        "classpath*:/applicationWebContext.xml",
		        "classpath*:/applicationContext-resources.xml"
		});
		
	
		

		PersonDao personDao = (PersonDao) applicationContext.getBean("personDao");
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> ");
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> " + personDao.something());
		//System.out.println(personDao.getAll());
		
		System.out.println(">>>> ApplicaitonContext: " + applicationContext != null);
		SpringIntegration.bindAll(binder(), applicationContext);
	}
}
