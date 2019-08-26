package org.launchcode.mycommute.models.data;

import org.launchcode.mycommute.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface UserDao extends CrudRepository <User, Integer>{
User findByname(String name);
}