package org.launchcode.mycommute.models.data;

import org.launchcode.mycommute.models.forms.Trip;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface TripDao extends CrudRepository <Trip, Integer>{

}