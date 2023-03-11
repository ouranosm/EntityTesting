package com.firstTry.firstTry.service;

import com.firstTry.firstTry.model.EntityOne;
import com.firstTry.firstTry.repository.EntityOneRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntityOneServiceImpl implements EntityOneService{

    private final EntityOneRepository entityOneRepository;

    public EntityOneServiceImpl(EntityOneRepository entityOneRepository) {
        this.entityOneRepository = entityOneRepository;
    }

    @Override
    public EntityOne createEntityOne(EntityOne entityOne) {
        return null;
    }

    @Override
    public EntityOne getEntityOne(Long id) {
        return null;
    }

    @Override
    public List<EntityOne> getAllEntityOne() {
        return null;
    }

    @Override
    public void deleteEntityOne(Long id) {

    }
}
