package com.lti.practise;
import java.io.*;
public class FactoryClient {
	public static void main(String ar[])
	{
		AnimalFactory factory = new AnimalFactory();
		Animal animal	 = null;
		
			try(InputStreamReader is = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(is))
			{
				System.out.println("Enter the type (herbivorous/ carnivorous)");
			String type = br.readLine();
			animal = factory.createAnimal( type );
			System.out.println("Created the type");
			animal.eat();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			

	}
}
