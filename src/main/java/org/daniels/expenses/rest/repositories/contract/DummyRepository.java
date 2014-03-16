package org.daniels.expenses.rest.repositories.contract;

import org.daniels.expenses.rest.domain.User;

public interface DummyRepository extends Repository<User> {
    User getDefaultUser();
}
