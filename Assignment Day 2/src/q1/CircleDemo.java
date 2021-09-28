package q1;

class Circle{
	private double radius;
	String color ="red";
	final double pi=3.14;
	
	
	
	public Circle(){
		
	}
	
	public Circle(double r){
		radius =r;
	}
	
		double getRadius() {
			
			return radius;
		}
		
		double getArea() {
			return pi*radius*radius;
		}
	
}

public class CircleDemo {
	
		public static void main(String[] args) {
			
			Circle circle=new Circle(1.0);
			System.out.println("Area of circle is : "+circle.getArea());
		}
}
