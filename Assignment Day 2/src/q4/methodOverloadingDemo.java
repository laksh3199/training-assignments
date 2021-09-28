package q4;

import java.util.Scanner;

class Student {
	String name, id;
	double grade;

	Student(String name, String id, double grade) {
		this(name,id);
		this.grade = grade;
	}

	Student(String name, String id) {
		this(id);
		this.name = name;
	}

	Student(String id) {
		this.id = id;
	}
	public void display() {
		if(name!=null)
		{
			System.out.println("Name : "+name);
		}
		System.out.println("ID : "+id);
		if(grade!=0.0)
		System.out.println("Grade : "+grade);
	}
	public void display(int year)
	{
		display();
		System.out.println("Year : "+year);
	}
}
public class methodOverloadingDemo {
         public static void main(String[] args) {
			Scanner scanner=new Scanner(System.in);
			Student obj;
			while(true) {
			System.out.println("Press 1 to enter Name ,Id and Grade");
			System.out.println("Press 2 to enter Name and Id");
			System.out.println("Press 3 to enter Id");
			int ch=scanner.nextInt();
			if(ch==1) {
				System.out.println("Press enter Name : ");
				String name=scanner.next();
				System.out.println("Press enter ID : ");
				String id=scanner.next();
				System.out.println("Press enter Grade : ");
				double grade=scanner.nextDouble();
				obj=new Student(name,id,grade);
				break;
				
			}
			else if(ch==2) {
				System.out.println("Press enter Name and ID ");
				obj=new Student(scanner.next(), scanner.next());
				break;
				
			}
			else if(ch==3) {
				System.out.println("Press enter ID ");
				obj=new Student(scanner.next());
				break;
			}
			else
			{
				System.out.println("Press enter number from given choices ");
			}
			}		
			while(true) {
				System.out.println("Press 1 to display values without year");
				System.out.println("Press 2 to display values with year");
				int opt=scanner.nextInt();
			if(opt==1) {

				obj.display();
				break;
			}
			else if(opt==2) {
				System.out.println("Press enter Year :");
				obj.display(scanner.nextInt());
				break;
			}
			else
			{
				System.out.println("Press enter number from given choices ");
			}
		}
			
	}
}

