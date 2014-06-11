package org.daniels.expenses.service.impl;

import org.daniels.expenses.dao.PersonDao;
import org.daniels.expenses.service.Sample;
import org.springframework.beans.factory.annotation.Autowired;

public class SampleImpl implements Sample{
	
	private PersonDao personDao;
	
	@Autowired
	public SampleImpl(PersonDao personDao) {
		this.personDao = personDao;
	}
}
