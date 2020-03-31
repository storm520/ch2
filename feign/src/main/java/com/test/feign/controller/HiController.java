package com.test.feign.controller;

import com.test.feign.service.schedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController public class HiController {

    @Autowired schedualServiceHi schedualServiceHi;

    @GetMapping(value = "/hello") public String sayHello(@RequestParam String name) {
        return schedualServiceHi.sayHiFromClientOne(name);
    }
}
