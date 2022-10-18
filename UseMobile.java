package day2;

public class UseMobile {
	public static void main (String []args) {
		Mobile mobile1 = new Mobile ();
		mobile1.brand="Red mi";
		mobile1.price=12000;
		mobile1.color="Black";
		mobile1.model="A234";
		mobile1.isTouchScreen=true;
		Mobile mobile2 = new Mobile ();
		mobile2.brand="Samsung";
		mobile2.price=24000;
		mobile2.color="Red";
		mobile2.model="A784";
		mobile2.isTouchScreen=true;
		Mobile mobile3 = new Mobile ();
		mobile3.brand="lenovo";
		mobile3.price=18000;
		mobile3.color="Black";
		mobile3.model="A904";
		mobile3.isTouchScreen=true;
		Mobile mobile4 = new Mobile ();
		mobile4.brand="I phone";
		mobile4.price=50000;
		mobile4.color="Gold";
		mobile4.model="A567";
		mobile4.isTouchScreen=true;
		
		System.out.println(mobile1.brand+" "+mobile1.price+" "+mobile1.color+" "+mobile1.model);
		System.out.println(mobile2.brand+" "+mobile2.price+" "+mobile2.color+" "+mobile2.model);
		System.out.println(mobile3.brand+" "+mobile3.price+" "+mobile3.color+" "+mobile3.model);
		System.out.println(mobile4.brand+" "+mobile4.price+" "+mobile4.color+" "+mobile4.model);



		
		
		
	}
	

}
