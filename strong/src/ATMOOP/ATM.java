package ATMOOP;

import ATM.ATMOperations;
import java.util.Scanner;

public class ATM implements ATMOperations{
	private int pin=0;
	double balance=0.0;
	
	
	public void deposit(double bal) {
		balance+=1;
	}
	
	@Override
	public void withdraw(double bal) {
		balance-=1;
	}
	
	
	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ATM a=new ATM();
		System.out.println("Set Pin :");
		a.setPin(sc.nextInt());
		System.out.println("Pin set Seccess!");
		System.out.println("-----------------");
		System.out.println("Enter Pin:");
		if(sc.nextInt()==a.getPin()){
			System.out.println("Login Success!");
			System.out.println("-----------------");
			for(;;) {
				System.out.println("Enter choice:");
				System.out.println("1.Deposit 2.Withdraw 3.CheakBalance 4.UpdatePin 5.DisplayPin 6.Exit");
				switch(sc.nextInt()) 
				{
				case 1:
					System.out.println("Enter amount to deposit:");
				    a.deposit(sc.nextDouble());
				    System.out.println("Deposit success!");
				    break;
				}
				case 2:
					System.out.println("Enter amount to Withdraw:");
					double amt=sc.nextDouble();
					if(amt>a.balance) {
						System.out.println("Insufficient Funds!");
					}
					else {
						a.withdraw(amt);
						System.out.println("Withdraw Success!");
					}
					break;
				case 3:
					a.checkBalance();
					break;
				case 4:
					System.out.println("Enter old pin:");
					if(sc.nextInt()==a.getPin()) {
						System.out.println("Enter old Pin:");
						a.setPin(sc.nextInt());
						System.out.println("Pin Update Success!");
						
					}
					else {
						System.out.println("Invalid credentials:");
					}
					break;
					
				case 5:
					System.out.println("Your Pin :" +a.getPin());
					break;
				case 6:
					System.out.println("LogOut");
					System.exit(0);
					break;
					
				default:
					System.out.println("Invalid choice:");
					
					
				
			}
			
		}
	}
	else {
		System.out.println("Invalid Pin... try again");
	}

}
