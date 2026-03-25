package com.linkcode.DerivedTypeCasting;

public class Puppy extends Dog{
	
	public void play() {
		System.out.println("Playing");
	}
	public static void main(String[] args) {
//           Upcasting...........
//		Puppy puppy =new Puppy();
//		puppy.bark();
//		puppy.sleep();
//		puppy.play();
//		
//		Dog dog=puppy;//UpCasting
//		dog.bark();
//		dog.sleep();
//	//  dog.play();	
//		
//		Animal animal=dog;//UpCasting
//		animal.sleep();
//	//  animal.bark();
//	//	animal.play();
		
		
		
		// DownCasting
		
		
		Animal animal=new Puppy();
		animal.sleep();
		Dog dog=(Dog)animal;
		dog.bark();
		dog.sleep();
		
		Puppy puppy=(Puppy)dog;
		puppy.bark();
		puppy.sleep();
		puppy.play();
	}

}
