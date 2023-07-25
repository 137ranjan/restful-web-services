package com.ranjan.rest.webservices.restfulwebservices.filtering;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class FilteringController {
    @GetMapping("/filtering")
    public SomBean filtering() {
        return new SomBean("value1", "value2", "value3");
    }
    @GetMapping("/filtering-list")
    public List<SomBean> filteringList() {
        return Arrays.asList(new SomBean("value1", "value2", "value3"),
                new SomBean("value1", "value2", "value3")) ;
    }
}
