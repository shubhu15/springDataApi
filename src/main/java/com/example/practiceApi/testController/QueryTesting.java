package com.example.practiceApi.testController;

import org.springframework.web.bind.annotation.*;

@RestController
public class QueryTesting {

    @RequestMapping("/queryTesting/{name}")
    public String getName(@PathVariable String name){
        return "hello "+name;
    }

    @RequestMapping("/queryTesting")
    public String getNamebyParam(@RequestParam(value = "name") String name){
        return "hello "+ name;
    }

    @RequestMapping(value = "/queryTesting", method = RequestMethod.POST)
    public String getNameBybody(@RequestBody String name){
        return "hello" + name;
    }

}
