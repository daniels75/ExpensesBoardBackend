package org.daniels.expenses.rest.repositories.contract;

import java.util.List;

public interface Repository<T> {

    List<T> getAll();

    T getById(int id);
}
