package com.abhave.location.repositories;

import com.abhave.location.entities.Location;
import org.springframework.data.jpa.repository.JpaRepository;


public interface LocationRepository extends JpaRepository<Location, Integer> {



}
