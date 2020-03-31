package com.john.mywebsite;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @RequestMapping(value="/", method= RequestMethod.GET)
    public User hello(@RequestParam String name){
        return new User(name, 2);
    }

}
