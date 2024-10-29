package day2;

public class Studentdemo {

	public static void main(String[] args) {
		Student s1= new Student();
		Student s2= new Student();
		Student s3= new Student();
		Student s4= new Student();
		Student s5= new Student();
		s1.setSid(101);
		s1.setSname("Mercy");
		s1.setSdept("ECE");
		s1.setSyear(2025);
		s1.setSnum(0000000);
		
		s2.setSid(102);
		s2.setSname("Kiru");
		s2.setSdept("ECE");
		s2.setSyear(2025);
		s2.setSnum(23456);
		
		s3.setSid(103);
		s3.setSname("Joshna");
		s3.setSdept("ECE");
		s3.setSyear(2025);
		s3.setSnum(22222);
		
		s4.setSid(104);
		s4.setSname("Jayapriya");
		s4.setSdept("ECE");
		s4.setSyear(2025);
		s4.setSnum(33333);
		
		s5.setSid(105);
		s5.setSname("Aruna");
		s5.setSdept("ECE");
		s5.setSyear(2025);
		s5.setSnum(444444);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
	}

}
