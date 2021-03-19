package com.grzebielucha.poc.jndiinjection.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LookupController {
    private static final Logger log = LoggerFactory.getLogger(LookupController.class);

    @RequestMapping("/lookup")
    public Object lookup(@RequestParam String name) throws Exception{
        log.info(name);
        return new javax.naming.InitialContext().lookup(name);
    }
}