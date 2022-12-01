package com.nano.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nano.entity.Hero;


@Repository
public interface HeroRepository extends JpaRepository<Hero, Long>{

	 Hero save(Hero hero);

}
