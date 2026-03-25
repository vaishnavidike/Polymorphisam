package com.linkcode.has;

public class Main {
	public static void main(String[] args) {
		 Engine engine=new Engine(23,250,"ICE");
		
		 Car car= new Car(101,"toyoto", 6, engine);
		 car.displayInfo();
		 
		 System.out.println(engine.type);
		 
		 
	
		        Human h = new Human();
		        h.live();
		    
	}

}
