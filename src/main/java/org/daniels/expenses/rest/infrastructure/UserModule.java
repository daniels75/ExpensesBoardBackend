package org.daniels.expenses.rest.infrastructure;

import org.daniels.expenses.dao.PersonDao;
import org.daniels.expenses.dao.hibernate.PersonDaoHibernate;
import org.daniels.expenses.rest.repositories.contract.DummyRepository;
import org.daniels.expenses.rest.repositories.contract.UserRepository;
import org.daniels.expenses.rest.repositories.impl.mock.DummyMockRepositoryImpl;
import org.daniels.expenses.rest.repositories.impl.mock.UserMockRepositoryImpl;
import org.daniels.expenses.rest.service.contract.DummyService;
import org.daniels.expenses.rest.service.contract.UserService;
import org.daniels.expenses.rest.service.impl.DummyServiceImpl;
import org.daniels.expenses.rest.service.impl.UserServiceImpl;
import org.daniels.expenses.service.PersonManager;
import org.daniels.expenses.service.Sample;
import org.daniels.expenses.service.impl.PersonManagerImpl;
import org.daniels.expenses.service.impl.SampleImpl;

import com.google.inject.AbstractModule;

public class UserModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(DummyRepository.class).to(DummyMockRepositoryImpl.class);
        bind(DummyService.class).to(DummyServiceImpl.class);

        bind(UserRepository.class).to(UserMockRepositoryImpl.class);
        bind(UserService.class).to(UserServiceImpl.class);
        //bind(PersonDao.class).to(PersonDaoHibernate.class);
//        bind(PersonManager.class).to(PersonManagerImpl.class);
        
        
       // bind(PersonDao.class).toProvider(fromSpring(PersonDao.class, "dataSource"));
    }
}
