package com.wkcto.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 梁超
 * @create 2021-04-13 15:31
 */
@RestController
public class HelloController {
    @PreAuthorize(value = "hasAnyRole('ADMIN')")
    @GetMapping("hello")
    public String hello(){
        return "Hello Security";
    }
}
