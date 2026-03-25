package com.linkcode.hirearchical.DerivedTypeCasting1;

public class Teacher extends Person {
	public void teach() {
		System.out.println("Teaching..");
	}
	public static void main(String[] args) {
		
		//UpCasting
//		Teacher t=new Teacher();
//		t.teach();
//		t.work();
//		
//		Student s=new Student();
//		s.study();
//		s.work();
//		
//		Person p=new Person();
//		p.work();
		
		
		
		// DownCasting
		
		Person p=new Teacher();
		p.work();
		Teacher t=(Teacher)p;
		t.teach();
		t.work();
		
//		Student s=(Student)p;
//		s.work();
//		s.study();
		
	
	}

}
