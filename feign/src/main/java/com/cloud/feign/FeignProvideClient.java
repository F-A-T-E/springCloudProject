package com.cloud.feign;

import com.cloud.entity.Student;
import com.cloud.feign.impl.FeignError;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.Collection;

@FeignClient(value="provider",fallback = FeignError.class)
public interface FeignProvideClient {
    @GetMapping("/student/findAll")
    public Collection<Student> findAll();

    @GetMapping("/student/index")
    public  String index();
}
















