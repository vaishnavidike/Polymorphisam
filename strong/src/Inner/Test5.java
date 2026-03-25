package Inner;

public class Test5 {
	public void m1(String[] args) {
		System.out.println("Outer class Method");
	}
	class Demo{
		public void m2() {
			System.out.println("Inner class Method");
		}
	}
		public static void main(String[] args) {
			Test5 t = new Test5();
			t.m1(args);
			
			Test5.Demo d=t.new Demo();
		}
	}


