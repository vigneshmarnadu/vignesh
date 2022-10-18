package day2;

public class UseShirt {
	public static void main(String []args) {
		Shirt shirt1 = new Shirt();
		shirt1.brand="yarn";
		shirt1.size=42;
		shirt1.color="Red";
		shirt1.price=700;
		shirt1.discountPercentage=10;
		shirt1.netPrice=shirt1.price-(shirt1.price*shirt1.discountPercentage/100);
		Shirt shirt2 = new Shirt();
		shirt2.brand="yiu";
		shirt2.size=42;
		shirt2.color="Red";
		shirt2.price=800;
		shirt2.discountPercentage=10;
		shirt2.netPrice=shirt2.price-(shirt2.price*shirt2.discountPercentage/100);
		Shirt shirt3 = new Shirt();
		shirt3.brand="uyt";
		shirt3.size=42;
		shirt3.color="Red";
		shirt3.price=900;
		shirt3.discountPercentage=10;
		shirt3.netPrice=shirt3.price-(shirt3.price*shirt3.discountPercentage/100);
		
		System.out.println("Brand = "+shirt1.brand+"   Size ="+shirt1.size+"  Net Price ="+shirt1.netPrice);
		System.out.println("Brand = "+shirt2.brand+"   Size ="+shirt2.size+"  Net Price ="+shirt2.netPrice);

		
		
		
		
		
		
		
		
		
	}

}
