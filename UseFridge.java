package day2;

public class UseFridge {
	public static void main(String[]args) {
	Fridge fridge1 = new Fridge();
	fridge1.brand="samsung";
	fridge1.price=18000;
	fridge1.color="Red";
	fridge1.model="Ayut";
	fridge1.taxPercentage=8;
	fridge1.taxAmount=fridge1.price+(fridge1.price*fridge1.taxPercentage/100);
	fridge1.discountPercentage=10;
	fridge1.discountAmount=fridge1.price*fridge1.discountPercentage/100;
	fridge1.netPrice=fridge1.price-fridge1.discountAmount;
	Fridge fridge2 = new Fridge();
	fridge2.brand="Whirpool";
	fridge2.price=20000;
	fridge2.color="White";
	fridge2.model="iuut";
	fridge2.taxPercentage=7;
	fridge2.taxAmount=fridge2.price+(fridge2.price*fridge2.taxPercentage/100);
	fridge2.discountPercentage=12;
	fridge2.discountAmount=fridge2.price*fridge2.discountPercentage/100;
	fridge2.netPrice=fridge2.price-fridge2.discountAmount;
	
	System.out.println("Brand = "+fridge1.brand+"   Net Price = "+fridge1.netPrice);
	System.out.println("Brand = "+fridge2.brand+"   Net Price = "+fridge2.netPrice);

	
	
	
	
	
	}
}
