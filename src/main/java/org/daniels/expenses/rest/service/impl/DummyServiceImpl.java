package org.daniels.expenses.rest.service.impl;

import org.daniels.expenses.rest.domain.User;
import org.daniels.expenses.rest.repositories.contract.DummyRepository;
import org.daniels.expenses.rest.service.contract.DummyService;

import com.google.inject.Inject;
import com.google.inject.Singleton;

@Singleton
public class DummyServiceImpl implements DummyService {

    private final DummyRepository dummyRepository;

    @Inject
    public DummyServiceImpl(DummyRepository dummyRepository) {
        this.dummyRepository = dummyRepository;
    }

    @Override
    public User getDefaultUser() {
        Object defaultUser = this.dummyRepository.getDefaultUser();
        return this.dummyRepository.getDefaultUser();
    }

}
