package java.cloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/zipkin")
public class ZipKinController {

    @Value("${server.port}")
    private  String port;

    @GetMapping("/index")
    public String index(){
        return this.port;
    }
}
