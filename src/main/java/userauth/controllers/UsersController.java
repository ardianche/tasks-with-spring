package userauth.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsersController {

    @RequestMapping("/users")
    @GetMapping
    public String getUser(){
        return "TESTII";
    }
}
