package com.lti.practise;

public class AnimalFactory {
 public Animal createAnimal (String type)
 {
	 
	 if(type.equals("Carnivorous"))
				 return new Carnivorous();
	 else
		 return new Herbivorous();
 		}
	}
