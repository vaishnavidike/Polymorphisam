package Neon;

public class Test3 {
	public static void m1()
	{
		System.out.println("Static method");
	}
	public void m2()
	{
		System.out.println("Non static method");
	}
	public static void main(String[] args)
	{
		m1();
		Test3.m1();
		
		System.out.println("----------------------------");
		
		Test3 t=new Test3();
		t.m2();
		
	}

}
