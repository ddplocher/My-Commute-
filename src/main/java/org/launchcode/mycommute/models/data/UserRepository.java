package org.launchcode.mycommute.models.data;

import org.launchcode.mycommute.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Transactional
@Repository

public interface UserRepository extends JpaRepository<User, Integer> {
    User findByUsername(String username);
}
