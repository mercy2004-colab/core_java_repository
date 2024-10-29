package day2;

public class EmployeeDemo {

	public static void main(String[] args) {
		Employee e1= new Employee();
		Employee e2= new Employee();
		Employee e3= new Employee();
		e1.setEid(101);
		e1.setEname("Mercy");
		e1.setCity("Cuddalore");
		
		System.out.println("employee id: "+e1.getEid()+" employee name: "+e1.getEname()+" Employee city: "+e1.getCity());
		

	}
}
