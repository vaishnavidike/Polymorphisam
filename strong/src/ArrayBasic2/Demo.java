package ArrayBasic2;

public class Demo {
	
	static int x=1;
	String name;
	public Demo(String name)
	{
		this.name=name;
	}
	public String toString() {
		return x++;	
	}
	
	public static void main(String[] args) {
		Demo d1=new Demo("Tom");
		Demo d2=new Demo("Jerry");
		Demo d3=new Demo("Jerry");
		Demo d4=new Demo("Jerry");
		Demo d5=new Demo("Jerry");
	    
		System.out.println(d1.hashCode());
		System.out.println(d2.hashCode());
		System.out.println(d3.hashCode());
		System.out.println(d4.hashCode());
		System.out.println(d5.hashCode());
		
	}
	
}
