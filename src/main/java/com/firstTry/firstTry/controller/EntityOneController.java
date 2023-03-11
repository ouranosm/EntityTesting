package com.firstTry.firstTry.controller;

import com.firstTry.firstTry.service.EntityOneService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/entityone")
public class EntityOneController {
    private final EntityOneService entityOneService;

    public EntityOneController(EntityOneService entityOneService) {
        this.entityOneService = entityOneService;
    }


    //@GetMapping("/{id")
    //public
}
