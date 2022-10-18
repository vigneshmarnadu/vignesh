package day2;

public class UseMarker {
	public static void main (String []args) {
		Marker marker1 = new Marker();
		marker1.brand="Doms";
		marker1.price=50;
		marker1.color="Black";
		marker1.isRefillable=false;
		
		Marker marker2 = new Marker();
		marker2.brand="Faber";
		marker2.price=70;
		marker2.color="Red";
		marker2.isRefillable=true;
		
		System.out.println(marker1.brand+"  "+marker1.price);
		System.out.println(marker2.brand+"  "+marker2.price);
		
		
		
	}
	

}
