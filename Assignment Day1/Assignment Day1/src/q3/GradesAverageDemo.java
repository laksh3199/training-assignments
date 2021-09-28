package q3;

import java.util.Scanner;

public class GradesAverageDemo {
	
private static Scanner in;
public static void main(String[] args) {
	/*
	 * Q3. Write a program called GradesAverage, which prompts user for the number of students, reads it
from the keyboard, and saves it in an int variable called numStudents. It then prompts user for the 
grades of each of the students and saves them in an int array called grades. Your program shall 
check that the grade is between 0 and 100. A sample session is as follow:
Enter the number of students: 3 
Enter the grade for student 1: 55 
Enter the grade for student 2: 108
Invalid grade, try again...
Enter the grade for student 2: 56
Enter the grade for student 3: 57
The average is: 56.0
	 */
	
	 in = new Scanner(System.in);
	
	System.out.print("Enter the number of students : ");
	int numStudents=in.nextInt();
	
	gradeAvg(numStudents);
	
	
}
	public static void gradeAvg(int n) {
		int grades[] = new int[n];
		float sum=0;
		int grade;
		
		for(int i=0;i<n;) {
			System.out.print("Enter the grade of student "+(i+1)+" :");
			grade=in.nextInt();
			if(grade>0 && grade<=100) {
				grades[i]=grade;
				sum+=grade;
				i++;
				continue;
			}
			System.out.println("Invalid grade, try again...");
		}
		System.out.println("The average is :"+(sum/n) );
	}
}
