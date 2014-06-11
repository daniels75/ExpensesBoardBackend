package org.daniels.expenses.service.impl;

import java.util.List;

import org.appfuse.service.impl.GenericManagerImpl;
import org.daniels.expenses.dao.PersonDao;
import org.daniels.expenses.entities.Person;
import org.daniels.expenses.service.PersonManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.inject.Inject;

@Service("personManager")
public class PersonManagerImpl extends GenericManagerImpl<Person, Long> implements PersonManager {
	PersonDao personDao;

	public PersonManagerImpl() {
	}

	@Autowired
	@Inject
	public PersonManagerImpl(PersonDao personDao) {
		this.personDao = personDao;
	}


	public List<Person> getPeople() {
		return personDao.getAll();
	}
	
	
}