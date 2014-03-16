package org.daniels.expenses.rest.service.impl;

import com.google.inject.Inject;
import com.google.inject.Singleton;

import java.util.List;

import org.daniels.expenses.rest.domain.User;
import org.daniels.expenses.rest.repositories.contract.UserRepository;
import org.daniels.expenses.rest.service.contract.UserService;

@Singleton
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Inject
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
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
