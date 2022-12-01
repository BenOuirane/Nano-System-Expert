package com.nano.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nano.entity.Hero;
import com.nano.repository.HeroRepository;

@Service
public class HeroServiceImlp    implements heroService {
	
	@Autowired
	HeroRepository heroRepository;

	@Override
	public ArrayList<Hero> nanoSystemExpert() {
		// TODO Auto-generated method stub
		String Q1 = "Le hero possede la caracteristique suivante :" ;
		String Q2 = "Le hero est " ;
		//String  respence ;
		ArrayList<Hero> heros = new ArrayList<>();
		heroRepository.findAll().forEach(heros::add);
		 String respence = "non"         ;
		 String respenceQ2 = "non"         ;
/// respence.equals("non") ||

		for(Hero hero : heros) {
			
			if ( respenceQ2.equals("non") ) {

		//	System.out.println(heros.size() );
	        Scanner in = new Scanner(System.in);

		//	 String respence = "non"         ;
			//	for(Hero heroo : heros) {
			
			System.out.println(Q1 + hero.characteristic + "?");
	      //  Scanner in = new Scanner(System.in);
	        System.out.println("Awnser : ");
	         respence = in.next();
			//	}
		//	}

	        
	    	if(hero.idHero == heros.size()  &&   respence.equals("non") ) {
	    		 Hero heroo = new Hero();
					System.out.println(" A quel heros pensiez-vous ? ");
			        Scanner nameHero = new Scanner(System.in);
			        String nameHeroo = in.next();
			        heroo.name = nameHeroo;
			        System.out.println(" Donnez une caracteristique particuliere a votre heros. ");
			        Scanner caracHero = new Scanner(System.in);
			        String  caracHeroo = in.next();
			        heroo.characteristic = caracHeroo;
			        heroRepository.save(heroo);
			        System.out.println(" Le hero " + nameHeroo  + " a ete ajoute a la base avec la caracteristique " + caracHeroo + "!" ); }
	   
	       if(respence.equals("oui")){
				System.out.println(Q2 + hero.name + " ?");
				Scanner inQ2 = new Scanner(System.in);
			    System.out.println("Awnser : ");
			      respenceQ2 = inQ2.next();
		   if(respenceQ2.equals("oui")){System.out.println(" Vous pensez a " + hero.name);}  
			   // second scenario   
		    if(respenceQ2.equals("non") ){
				        Hero heroo = new Hero();
						System.out.println(" A quel heros pensiez-vous ? ");
				        Scanner nameHero = new Scanner(System.in);
				        String nameHeroo = in.next();
				        heroo.name = nameHeroo;
				        System.out.println(" Donnez une caracteristique particuliere a votre heros. ");
				        Scanner caracHero = new Scanner(System.in);
				        String  caracHeroo = in.next();
				        heroo.characteristic = caracHeroo;
				        heroRepository.save(heroo);
				        System.out.println(" Le hero " + nameHeroo  + " a ete ajoute a la base avec la caracteristique " + caracHeroo + "!" );
				        }   }


	       // herre
		
			
	       
			}
			//	return null;

				//function
	  }
		return heros;	
		
	}
		
		// Class
}
