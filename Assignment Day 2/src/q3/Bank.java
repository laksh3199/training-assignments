package q3;

import java.util.Random;
import java.util.Scanner;

class Account{
	Scanner scanner = new Scanner(System.in);
	 String name;
	 long AccNo;
	 double balance=0.0;
	 double withdraw;
	 
	 public Account(){
		 
	 }
	
	Account(String name,double balance ){
		super();
		this.name=name;
		
		this.balance=balance;
	}
	
	void deposit() {
		System.out.println("Enter the amount to deposit :");
		double deposit=scanner.nextDouble();
		
		balance =balance+deposit;
	}	
}

class SavingsAccount extends Account{

SavingsAccount(String name, double balance) {
		super(name, balance);
		
	}
int interest=5;


void getbalance() {
	
	System.out.println("Balance is :"+balance);
}

void updatedBalance() {
	double totalAmount=balance+(balance*0.05);
	
	System.out.println("Enter the amount to deposit :");
	double deposit=scanner.nextDouble();
	
	balance =balance+deposit;
}

void withdraw() {
	System.out.println("Enter the amount to withdraw :");
	withdraw=scanner.nextDouble();
	
	if(balance<=500 || balance<(balance-withdraw)) {
		System.out.println("Withdraw not possible as amount is going to be less than minimum amount...");
	}
	else {
		balance=balance-withdraw;
		
	}
}	
}

class CurrentAccount extends Account{

	CurrentAccount(String name, double balance) {
		super(name, balance);
		
	}
	
	int tradeLisenceNo;
	
	
	void getBalance() {
		System.out.println("Balance is :"+balance);
	}
	
	void withdraw() {
		System.out.println("Enter the amount to withdraw :");
		withdraw=scanner.nextDouble();
		
		if(withdraw<balance) {
			balance=(balance-withdraw);
		}else {
			System.out.print("Insufficient balance");
		}	
	}
}

public class Bank {
	
	public static void main(String[] args) {
		
	 Scanner scanner=new Scanner(System.in);
	 SavingsAccount sav = null;
		CurrentAccount cur = null;
		Account acc=new Account();
		
		System.out.println("Welcome to Bank");
		System.out.println("Creating Your Account");
		System.out.println("Enter your name: ");
		String username=scanner.nextLine();
		
		System.out.println("Choose the type of Account \n1.Savings Account \n2.Current Account :");
		int choice=scanner.nextInt();
		scanner.hasNextLine();
		
		System.out.println("Enter the initial balance in the account : ");
		double balance=scanner.nextDouble();
		if(choice==1) {
			 sav = new SavingsAccount(username,balance);
			sav.AccNo = (long) (10000 + Math.random()*89999);
		}
		else if(choice==2) {
			 cur = new CurrentAccount(username,balance);
			cur.AccNo = (long) (10000 + Math.random()*89999);
		}
		
		while(true) {
			
			System.out.println(" What do you want to do next :");
			System.out.println(" 1 Deposit:");
			System.out.println(" 2 Withdraw:");
			System.out.println(" 3 Display the Balance:");
			System.out.println(" 0 for Exit");
			int opt = scanner.nextInt();
			scanner.nextLine();
			
			if(opt==1) {
				System.out.println("Want to check balance before deposit ? (y/n)");
				String ans=scanner.next();
				if(ans.equals("y"))
				{
					sav.getbalance();
					
				}
				
				sav.updatedBalance();
				
				System.out.println("Balance deposited to Account "+sav.AccNo);
				
				System.out.println("Want to check balance before deposit ? (y/n)");
				ans=scanner.next();
				if(ans.equals("y"))
				{
					sav.getbalance();
					
				}
			}
			else if(opt==2) {
				System.out.println("Want to check balance before withdraw ? (y/n)");
				String ans=scanner.next();
				if(ans.equals("y"))
				{
					sav.getbalance();
					
				}
				
				sav.withdraw();
				
				System.out.println("Want to check balance after deposit ? (y/n)");
				 ans=scanner.next();
				if(ans.equals("y"))
				{
					sav.getbalance();
					
				}
			}
			else if(opt==3) {
				sav.getbalance();
				
			}
			else if(opt==0) {
				System.out.println("Thankyou");
				System.exit(0);
			}
			else {
				System.out.println("Wrong Input");
			}
		}
		
	}
}
