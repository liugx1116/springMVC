package com.atgx.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class testController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/success")
    public String hello() {
        return "success";
    }

    @RequestMapping(
            value = {"/testParamsAndHeaders", "/test1"},
            params = {"username=admin", "password!=123"},
            headers = {"Host=localhost:8080"}
    )
    public String testParamsAndHeaders() {
        return "success";
    }

    @RequestMapping("/a*a/testAnt")
    //@RequestMapping("/a*a/testAnt")
//    @RequestMapping("/**/testAnt")
    public String testAnt() {
        return "success";
    }

    @RequestMapping("/testPath/{id}/{username}")
    public String testPath(@PathVariable("id") Integer id, @PathVariable("username") String username) {
        System.out.println("id:" + id + ",username:" + username);
        return "success";
    }

    @RequestMapping("/testPath1/{id}/{name}")
    public String testPath1(@PathVariable("id") Integer id, @PathVariable("name") String name) {
        System.out.println("id:" + id + ",name:" + name);
        return "success";
    }

    @RequestMapping("/param")
    public String param() {
        return "test_param";
    }

}
