package q5;

import java.util.Scanner;

class Vehicle{
	int noOfWheel,noOfPassenger,model;
	String make;
	public void display()
	{
		System.out.println("Make : "+make);
		System.out.println("Model : "+model);
		System.out.println("No. of Wheel : "+noOfWheel);
		System.out.println("No. of passengers : "+noOfPassenger);
	}
}
class Car extends Vehicle{
	int noOfdoor;
	public void display() {
		System.out.println("Make : "+make);
		System.out.println("Model : "+model);
		System.out.println("No. of doors : "+noOfdoor);
	}
}
class Convertible extends Car{
	boolean isHoodOpen;
	public void display() {
		System.out.println("Make : "+make);
		System.out.println("Model : "+model);
		System.out.println("No. of doors : "+noOfdoor);
		if(isHoodOpen==true)
			System.out.println("Hood is Open");
		else
			System.out.println("Hood is Close");
	}
}
class SportCar extends Car{
	public void display() {
		System.out.println("Make : "+make);
		System.out.println("Model : "+model);
		System.out.println("No. of doors : "+2);
	}
}
public class methodOverridingDemo {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Press 1 to create a Vehicle object.");
		System.out.println("Press 2 to create a Car object.");
		System.out.println("Press 3 to create a Convertible object.");
		System.out.println("Press 4 to create a Sport car object.");
		int c=scanner.nextInt();
		if (c == 1) {
         Vehicle v=new Vehicle();
         v.display();
         }
		else if (c == 2) {
			Car v=new Car();
			v.display();
		}
		else if (c == 3) {
			Convertible v=new Convertible();
			v.display();
		}
		else if (c == 4) {
           SportCar v=new SportCar();
           v.display();
		}
		scanner.close();
	}
}

