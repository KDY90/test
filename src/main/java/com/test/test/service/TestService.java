package com.test.test.service;


import com.test.test.mapper.TestMapper;
import com.test.test.model.TestModel;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class TestService {

    @Autowired
    TestMapper testMapper;

    /**
    *
    * Comment : TEST테이블 조회
    * Date : 2020.08.30
     *  */

    public List<TestModel> getTestList() {

        return testMapper.selectTest();
    }

    public void save(TestModel model){

       testMapper.saveTest(model);
    }

    public void delete(TestModel model){

        testMapper.deleteTest(model);
    }

    public void update(TestModel model){

        testMapper.updateTest(model);
    }

}
