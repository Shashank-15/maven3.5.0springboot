package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("/demo")
public class Controller {

    @PostMapping("/hello")
    public HelloDto getdemo(@RequestBody HelloDto hello){

        return hello;
    }


}
