package com.firstTry.firstTry.service;

import com.firstTry.firstTry.model.EntityOne;

import java.util.List;

public interface EntityOneService {

    EntityOne createEntityOne(EntityOne entityOne);

    EntityOne getEntityOne(Long id);

    List<EntityOne> getAllEntityOne();

    void deleteEntityOne(Long id);
}
