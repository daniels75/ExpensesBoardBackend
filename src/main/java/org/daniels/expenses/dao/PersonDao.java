package org.daniels.expenses.dao;

import org.appfuse.dao.GenericDao;
import org.daniels.expenses.entities.Person;

import java.util.List;
public interface PersonDao extends GenericDao<Person, Long> {
    public List<Person> findByLastName(String lastName);
	
	public String something();
}