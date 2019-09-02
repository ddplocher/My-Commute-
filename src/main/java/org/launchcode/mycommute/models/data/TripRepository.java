package org.launchcode.mycommute.models.data;

import org.launchcode.mycommute.models.forms.Trip;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TripRepository extends JpaRepository<Trip, Integer> {
}
