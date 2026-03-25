package com.linkcode.DerivedTypecasting2;

public class Wipro extends ITCompoany{
	public void Project() {
		System.out.println("Completed Project");
	}
	
	public static void main(String[] args) {
		
//		UPCasting
		
		
//		Wipro w =new Wipro();
//		w.Work();
//		w.Devlop();
//		w.Project();
//		
//		ITCompoany i= new ITCompoany();
//		i.Devlop();
//		i.Work();
//		
//		Company c= new Company();
//		c.Work();
		
		// DownCasting
		
		Company C= new Wipro();
		C.Work();
		ITCompoany i=(ITCompoany) C;
		i.Work();
		i.Devlop();
		Wipro wipro=(Wipro) i;
		wipro.Work();
		wipro.Devlop();
		wipro.Project();
	}

}
