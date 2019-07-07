package com.qhit.test.service.impl;

import com.qhit.test.entity.Test;
import com.qhit.test.mapper.TestMapper;
import com.qhit.test.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Date:2019/7/7
 * @Description:
 * @version:1.0
 */
@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestMapper testMapper;


    public List<Test> selAll() {
        return testMapper.selAll();
    }
}
