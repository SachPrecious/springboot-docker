package com.example.springbootdocker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

@GetMapping("/message")
public String getMessage(){
    return "Welcome To Spring Docker";
}


}
