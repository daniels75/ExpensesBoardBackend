package org.daniels.expenses.service;

import java.util.List;

import org.appfuse.service.GenericManager;
import org.daniels.expenses.entities.Person;

public interface PersonManager extends GenericManager<Person, Long> {
    List<Person> getPeople();
}