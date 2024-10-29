package day2;
public class Customerdemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c1= new Customer();
		Customer c2= new Customer();
		Customer c3= new Customer();
		Customer c4= new Customer();
		Customer c5= new Customer();
		
		c1.setCid(101);
		c1.setCname("Mercy");
		c1.setAddress("semmandalam");
		c1.setCity("Cuddalore");
		
		c2.setCid(102);
		c2.setCname("Kiru");
		c2.setAddress("Nathapatu");
		c2.setCity("Cuddalore");
		
		c3.setCid(103);
		c3.setCname("Joshna");
		c3.setAddress("Lawspet");
		c3.setCity("Puducherry");
		
		c4.setCid(104);
		c4.setCname("Jayapriya");
		c4.setAddress("Mudaliarpet");
		c4.setCity("Puducherry");
		
		c5.setCid(105);
		c5.setCname("Aruna");
		c5.setAddress("semmandalam");
		c5.setCity("Cuddalore");
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
	}

}
