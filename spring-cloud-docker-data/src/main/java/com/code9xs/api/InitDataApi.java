package com.code9xs.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author by su.haodong
 * @Classname InitDataApi
 * @Description TODO
 * @Date 2024/7/29/029 14:57
 */
@RestController
@RequestMapping(value = "init")
public class InitDataApi {

    @GetMapping(value = "hello")
    public String getHelloData() {
        return "Hello World!";
    }
}
