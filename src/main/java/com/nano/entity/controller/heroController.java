package com.nano.entity.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nano.entity.Hero;
import com.nano.service.HeroServiceImlp;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class heroController {
	
	
	
	  @Autowired
	  HeroServiceImlp heroServiceImlp ;
	

    @GetMapping("/nano")
    public ArrayList<Hero> nanoSystemExpert() {

        return heroServiceImlp.nanoSystemExpert();
    }
    
    
    
	

}
