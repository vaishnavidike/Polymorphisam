package Practice;
import java.util.Scanner;
public class Demo {
	private int pin;
	private String Pswd;
	public int getPin() {
		return pin;
		
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public String getPswd() {
		return Pswd;
	}
	
	public void setPswd(String pswd) {
		Pswd = pswd;
	}
	
	
	public static void main(String[] args) {
		Demo d=new Demo();
		d.setPin(123);
		d.setPswd("Ram@123");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Pin");
		if(sc.nextInt()==d.getPin()) {
			System.out.println("Enter Password:");
			if(sc.next().toString().contains(d.getPswd()));
			{
				System.out.println("Login Success!");
			}
		
			
//			else {
//				System.out.println("Incorrect Password");
//			}
//			
		}
		else {
			System.out.println("Invalid Credentials");
		}
		
	}
}
