package com.lexin.service.impl;

import com.lexin.mapper.TestMapper;
import com.lexin.po.Test;
import com.lexin.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestMapper testMapper;


    @Override
    public List<Test> test() {
        return testMapper.selectAll();
    }
}
