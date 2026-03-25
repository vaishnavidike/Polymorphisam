package com.linkcode.has;

public class Car {
	int cno;
	String cname;
	int noseats;
	Engine engine;
	
	public Car(int cno, String cname, int i, Engine engine) {
		super();
		this.cno = cno;
		this.cname = cname;
		this.noseats = i;
		this.engine = engine;
	}
	public void displayInfo() {
		System.out.println("Cname:"+cname);
		System.out.println("no of Seats:"+noseats);
		System.out.println("Engine Details:"+engine.engineno+","+engine.power+","+engine.type);
	}
	
}
