package q1;

public class FibonacciDemo {
	public static void main(String[] args) {
		/*
		Q1. Write a program called Fibonacci to display the first 20 Fibonacci numbers F(n), where 
    	F(n)=F(n–1)+F(n–2) and F(1)=F(2)=1. Also compute their average. The output shall look like:
		The first 20 Fibonacci numbers are:
		1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181 6765
		The average is 885.5 */
		
		FibonacciSeries(20);
		
	}
	
	public static void FibonacciSeries(int n) {
		int n1=1,n2=1,n3;
		float avg=0.0f;
		System.out.print("The first 20 Fibonacci numbers are : "+n1+" "+n2);
		
		for(int i=2;i<n;++i) {
			n3=n2+n1;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
			avg+=n3;	
		}
		System.out.println("\nThe Average is : "+avg/n);
	}
}
