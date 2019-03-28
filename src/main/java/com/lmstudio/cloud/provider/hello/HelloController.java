package com.lmstudio.cloud.provider.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * HelloController
 *
 * @author: liumin
 * @date: 2019/03/27
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String sayHello(String name){
        return "hello, "+ name;
    }
}
