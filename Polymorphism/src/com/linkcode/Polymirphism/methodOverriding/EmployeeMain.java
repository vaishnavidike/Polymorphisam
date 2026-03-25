package com.linkcode.Polymirphism.methodOverriding;

public class EmployeeMain {
	public static void main(String[] args) {
		Employee emp=new Employee(1,"Vaishu",40000,"Pune");
		Object obj=emp;
		System.out.println(obj.toString());
		
		System.out.println(emp.hashCode());
		
//		emp.dislpayInfo();
//		
//		System.out.println(emp);
//		System.out.println(emp.toString());
//		
		Employee emp1=new Employee(2,"Shrutaa",30000,"Mumbai");
     	System.out.println(emp1.toString());
     	
     	Employee emp2=new Employee(1,"Vaishu",40000,"Pune1");
		Employee emp3=new Employee(2,"Shrutaa",30000,"Mumbai1");
		System.out.println(emp2);
		System.out.println(emp3);
		System.out.println(emp2.equals(emp3));
		
	}

}
