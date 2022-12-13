package carproject;

public class Car {
	public int amountOfFuel;
	public String brand, model;
	
	public Car() {
		amountOfFuel=0;
		brand="";
		model="";
	}
	
	public Car(int amountOfFuel, String brand, String model) {
		this.amountOfFuel=amountOfFuel;
		this.brand=brand;
		this.model=model;
		
	}
	
			
	public void  Break() {
	System.out.println("Car is breaking");
	}
	
	public void  accelerate() {
		System.out.println("Car is accelerating");
		amountOfFuel=amountOfFuel -1;
		}
	public void  printData() {
		System.out.println("Brand name of a car :" + this.brand);
		System.out.println("Model of "+brand+ "car is :" + this.model);
		System.out.println("Amount of fuel at the starting point :"+ this.amountOfFuel);
		}
	
	public void refuel(int amount) {
		System.out.println("Fuel on the tank:" + this.amountOfFuel);
		System.out.println("Refuel amont :" + amount);
		this.amountOfFuel +=amount;
		System.out.println("Fuel on the tank after the refuel: " + this.amountOfFuel);
		
		
        public void  Break() {
	System.out.println("Car is breaking");
	}
		
		
}		


}
