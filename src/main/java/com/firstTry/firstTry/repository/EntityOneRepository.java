package com.firstTry.firstTry.repository;

import com.firstTry.firstTry.model.EntityOne;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntityOneRepository extends JpaRepository<EntityOne, Long> {

}
