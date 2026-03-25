package Static;


public class Test11 {
	public Test11() {
		System.out.println("Constructor");
		
	}
	public static void A1() {
		System.out.println("Static Method");
	}
	public static void A2() {
		System.out.println("Non Static");
	}
	
	public static void main(String[] args) {
		Demo d=Test11::new;
		d.m1();
	
	}
	

}
