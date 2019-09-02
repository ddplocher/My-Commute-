package org.launchcode.mycommute.models.data;

import org.launchcode.mycommute.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findByUsername(String username);
}
