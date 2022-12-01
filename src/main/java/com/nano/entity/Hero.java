package com.nano.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;



@Entity
@Table(name = "hero")
public class Hero {
	
	
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    @Column(name = "id")
    public Long idHero;

    @Column(name = "name")
    public String name ;
    @Column(name = "characteristic")
    public String  characteristic;
    
      
	public Hero(Long idHero, String name, String characteristic) {
		super();
		this.idHero = idHero;
		this.name = name;
		this.characteristic = characteristic;
	}


	public Hero() {
		
	}


	public Long getIdHero() {
		return idHero;
	}


	public void setIdHero(Long idHero) {
		this.idHero = idHero;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCharacteristic() {
		return characteristic;
	}


	public void setCharacteristic(String characteristic) {
		this.characteristic = characteristic;
	}
	
	
    
    
    
    
    

}
