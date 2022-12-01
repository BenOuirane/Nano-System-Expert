package com.nano.seeds;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nano.entity.Hero;
import com.nano.repository.HeroRepository;

@Component
public class HeroDataLoader implements CommandLineRunner{
	
	
	@Autowired
	HeroRepository heroRepository;

	@Override
	public void run(String... args) throws Exception {
		loadUserData();
	}

	private void loadUserData() {
		if (heroRepository.count() == 0) {
			Hero hero1 = new Hero(1L, "Batman", "a une cap");
			heroRepository.save(hero1);
		}
		System.out.println(heroRepository.count());
	}
	

}
