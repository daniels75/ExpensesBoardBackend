package org.daniels.expenses.rest.service.contract;

import java.util.List;

import org.daniels.expenses.rest.domain.User;

public interface UserService {

    List<User> getAllUsers();

    User getById(int id);

    User createNewUser(User user);

    User update(User user);

    void remove(int id);

    int getNumberOfUsers();
}
