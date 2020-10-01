package com.cloud.feign.impl;

import com.cloud.entity.Student;
import com.cloud.feign.FeignProvideClient;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class FeignError implements FeignProvideClient {
    @Override
    public Collection<Student> findAll() {
        return null;
    }
    @Override
    public String index() {

        return "服务器维护中.....";
    }
}
