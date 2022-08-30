package com.test.test.controller;

import com.test.test.model.TestModel;
import com.test.test.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    TestService testService;


    @RequestMapping("/")
    public String index() {
        return "Hello!";
    }


    @PostMapping("/list")
    public ResponseEntity<?>  model(){
        Map<String, Object> resultMap = new HashMap<>();
        List<TestModel> list = testService.getTestList();
        resultMap.put("list", list);
        System.out.println("testService.getTestList()"+testService.getTestList().toString());
        System.out.println("list"+list.toString());
        System.out.println("resultMap"+resultMap.toString());
        return new ResponseEntity<>(resultMap, HttpStatus.OK);
    }


    @GetMapping("/TestModel")
    public ArrayList<TestModel> memberTest2(){
        return new ArrayList(Arrays.asList(
                new TestModel("1","2","3","4")

        ));
    }



}
