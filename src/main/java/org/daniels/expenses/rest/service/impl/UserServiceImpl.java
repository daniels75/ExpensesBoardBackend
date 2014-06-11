package org.daniels.expenses.rest.service.impl;

import com.google.inject.Inject;
import com.google.inject.Singleton;

import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.appfuse.service.GenericManager;
import org.daniels.expenses.dao.PersonDao;
import org.daniels.expenses.entities.Person;
import org.daniels.expenses.rest.domain.User;
import org.daniels.expenses.rest.repositories.contract.UserRepository;
import org.daniels.expenses.rest.service.contract.UserService;
import org.daniels.expenses.service.PersonManager;
import org.daniels.expenses.service.impl.SampleImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

@Singleton
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    //private final GenericManager<Person, Long> personManager;

//    @AUTOWIRED
//    PERSONDAO PERSONDAO;
//    
//    
//    @AUTOWIRED
//    @QUALIFIER("FOO")
//    PERSONDAO SOMEDTO;
    
    @Inject
    //@Autowired
    public UserServiceImpl(UserRepository userRepository, HttpServletRequest request) {
        System.out.println("!!!!!!>>>>>>>>>>>>>>>>> UserServiceImpl!");
    	ServletContext context = request.getServletContext();
        this.userRepository = userRepository;
		if (context != null) {
			System.out.println("!!!!!!>>>>>>>>>>>>>>>>> context is not null!");
	        ApplicationContext ac = WebApplicationContextUtils.getRequiredWebApplicationContext(context);

//	        ApplicationContext ac = new ClassPathXmlApplicationContext(new String [] {
//	                "classpath*:/applicationContext.xml",
//	                "classpath:/applicationContext-dao.xml",
//	                "classpath*:/applicationWebContext.xml",
//	                "classpath*:/applicationContext-resources.xml"
//	        });
	        
	        System.out.println("App Context exists: " + ac != null);
	        if (ac != null){
	            PersonDao personDao = (PersonDao) ac.getBean("personDao");
	            System.out.println("personDao: " + personDao.getAll());
	        }
			
		} else {
			System.out.println("!!!!!!>>>>>>>>>>>>>>>>> context is null!");
		}
		
		
    }

    @Override
    public List getAllUsers() {
        return this.userRepository.getAll();
    }

    @Override
    public User getById(int id) {
        return this.userRepository.getById(id);
    }

    @Override
    public User createNewUser(User user) {
        User u = this.userRepository.create(user);
        return u;
    }

    @Override
    public User update(User user) {
        return this.userRepository.update(user);
    }

    @Override
    public void remove(int id) {
        this.userRepository.remove(id);
    }

    @Override
    public int getNumberOfUsers() {
        return this.userRepository.getNumberOfUsers();
    }
}
