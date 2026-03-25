package Multithreding;

public class Driver {
	public static void main(String[] args) throws InterruptedException{
		OddEven   o=new OddEven();
		Primenumber p=new Primenumber();
		
		
		o.start();
		o.join();
		p.start();
	}

}
