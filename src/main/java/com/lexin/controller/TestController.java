package com.lexin.controller;

import com.lexin.ApiResponse;
import com.lexin.po.Test;
import com.lexin.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/test")
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping("/get")
    public ApiResponse get(){
        List<Test> test = testService.test();
        return new ApiResponse(test);
    }
}
