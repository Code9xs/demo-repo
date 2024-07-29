package com.code9xs.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author by su.haodong
 * @Classname TestApi
 * @Description TODO
 * @Date 2024/7/29/029 15:21
 */
@RestController
@RequestMapping(value = "test")
public class TestApi {
    @GetMapping(value = "demo")
    public String testApi(){
        return "this is test api";
    }
}
