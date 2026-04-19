package assignments;

import java.util.Scanner;

class Vehicle {
	 String brand;
	 int speed;
	 static String company = "Maruthi NEXA";
	 
	 Vehicle(String brand, int speed) {
	     this.brand = brand;
	     this.speed = speed;
	 }

	 void print() 
	 {
	     System.out.println("Brand: " + brand);
	     System.out.println("Speed: " + speed);
	 }

	 //Overridden method
	 void run() {
	     System.out.println("Vehicle is running");
	 }
	 
	 final void engineType() 
	 {
	     System.out.println("Engine type:Petrol Engine");
	 }

	 static void printCompany() 
	 {
	     System.out.println("Company: " + company);
	 }
	 
	}

	class Car extends Vehicle {
	 String fuelType;

	 Car(String brand, int speed, String fuelType) 
	 {
	     super(brand, speed);
	     this.fuelType = fuelType;
	 }
	 void print() 
	 {
		 super.print();
	     System.out.println("Fuel Type: " + fuelType);
	 }

	 //Overriding method
	 void run() {
	     System.out.println("Car is running smoothly");
	 }

	 // ❌ Cannot override final method (will give error)
	 /*
	 void engineType() {
	     System.out.println("Engine type: Disel Engine"));
	 }
	 */
	}
public class Week7_Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Car car= new Car("Baleno", 150, "Petrol");
	     car.print();
	     System.out.println();

	     Vehicle vehicle = new Vehicle("NEXA", 80);
	     //method overriding
	     vehicle.run();
	     car.run();

	     System.out.println();

	     //calling static variable
	     Vehicle.printCompany();
	     System.out.println();
	     
	     Scanner sc = new Scanner(System.in);
		 System.out.print("Enter vehicel brand name: ");
		 String input=sc.next();

	     //Reversing String
	     String reversed = new StringBuilder(input).reverse().toString();
	     System.out.println("Reversed: " + reversed);

	     //Replacing vowels with *
	     String replaced = input.replaceAll("[aeiouAEIOU]", "*");
	     System.out.println("Replaced: " + replaced);

	     //Check if brand is Hyundai
	     System.out.println("Equals Hyundai: " + input.equals("Hyundai"));

	}

}
