package com.mastercard.poc.controller;

import java.util.List;

import com.mastercard.poc.dao.TestRepository;
import com.mastercard.poc.entity.TestEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {

    @Autowired
    TestRepository testRepository;

    @GetMapping("/getDetails")
    public List<TestEntity> getDetails() {
        return testRepository.findAll();
    }

    @GetMapping("/getDetailswithinRange/{start}/{end}")
    public List<TestEntity> getDetailsWithInRange(@PathVariable("start") int start, @PathVariable("end") int end) {
        return testRepository.findRecordsInRange(start,end);
    }

    @PostMapping("/createData")
    public TestEntity createTestData(@RequestBody TestEntity testEntity) {
        return testRepository.save(testEntity);
    }

}
