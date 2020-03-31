package com.test.feign.service;

import org.springframework.stereotype.Component;

@Component public class SchedualServiceHiHystric implements schedualServiceHi {
    @Override public String sayHiFromClientOne(String name) {
        return "sorry" + name;
    }
}
