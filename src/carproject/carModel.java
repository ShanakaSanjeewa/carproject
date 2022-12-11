package carproject;

public class carModel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//car1 object methods
		Car car1=new Car(65,"Tesla", "456");
		
		car1.printData();
		car1.accelerate();
		System.out.println("Fuel amount after accelerate :" + car1.amountOfFuel);
		car1.Break();
		car1.printData();
		
		
		Car car2=new Car(40,"Toyota", "90");
		car2.printData();
		car2.accelerate();
		System.out.println("Fuel amount after accelerate :" + car2.amountOfFuel);
		car2.Break();
		car2.refuel(5);
		
	}


	}


