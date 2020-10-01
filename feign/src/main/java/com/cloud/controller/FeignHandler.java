package com.cloud.controller;
import com.cloud.entity.Student;
import com.cloud.feign.FeignProvideClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Collection;

@RestController
@RequestMapping("/feign")
public class FeignHandler {

    @Autowired
    private FeignProvideClient feignProvideClient;


    @GetMapping("/findAll")
    public Collection<Student> findAll(){
        return feignProvideClient.findAll();
    }
    @GetMapping("/index")
    public  String index(){
        return feignProvideClient.index();
    }
}
