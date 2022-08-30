package com.test.test.mapper;

import com.test.test.model.TestModel;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface TestMapper {

    List<TestModel> selectTest();


}
