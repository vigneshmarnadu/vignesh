package day2;

public class UseCar {
	public static void main (String []args) {
		Car car1 = new Car ();
		car1.brand="Toyota";
		car1.price=300000;
		car1.color="Black";
		car1.taxAmount=2000;
		car1.netPrice=car1.price+car1.taxAmount;
		Car car2 = new Car ();
		car2.brand="Hundai";
		car2.price=200000;
		car2.color="Black";
		car2.taxAmount=2000;
		car2.netPrice=car2.price+car2.taxAmount;
		Car car3 = new Car ();
		car3.brand="Renault";
		car3.price=250000;
		car3.color="Red";
		car3.taxAmount=1000;
		car3.netPrice=car3.price+car3.taxAmount;
		
		System.out.println("Brand = "+car1.brand+"   Net Price"+car1.netPrice);
		System.out.println("Brand = "+car2.brand+"   Net Price"+car2.netPrice);
		System.out.println("Brand = "+car3.brand+"   Net Price"+car3.netPrice);	
	}

}
