package org.launchcode.mycommute.models.data;

import org.launchcode.mycommute.models.forms.Trip;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Transactional
@Repository

public interface TripRepository extends JpaRepository<Trip, Integer> {
}
