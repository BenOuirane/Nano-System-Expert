package com.nano;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

import com.nano.entity.Hero;
import com.nano.repository.HeroRepository;
import com.nano.service.HeroServiceImlp;

@SpringBootApplication
public class NanoSystemExpertApplication {

	
  
	public static void main(String[] args) {
		SpringApplication.run(NanoSystemExpertApplication.class, args);

			// TODO Auto-generated method stub
		
	}
	
	
}
