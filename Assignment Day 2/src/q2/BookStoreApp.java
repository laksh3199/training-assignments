package q2;

import java.util.ArrayList;
import java.util.Scanner;

class Book{
	 String bookTitle;
	 String bookAuthor;
	 String isbn;
	 int numOfCopies;
	 
	 public Book(String title, String author, String isbnNo, int numOfCopies) {
		 bookTitle = title;
		 bookAuthor=author;
		 isbn=isbnNo;
		 this.numOfCopies=numOfCopies;
	 }
	 
	 void display() {
		 System.out.println("Book Title : "+bookTitle+"Author : "+bookAuthor+" ISBN No. : "+isbn+"Quantity : "+numOfCopies);
	 }
 }
 
 class BookStore {
		ArrayList<Book> book = new ArrayList<Book>();
		Scanner sc = new Scanner(System.in);
		public void sell(String bookTitle, int numOfCopies)
		{
			if(!book.isEmpty())
			{
				for(int i = 0; i < book.size(); i++)
				{
					if(book.get(i).bookTitle.equals(bookTitle))
					{
						System.out.println("Numberof copies of books before selling:" + book.get(i).numOfCopies);
						book.get(i).numOfCopies = book.get(i).numOfCopies-numOfCopies;
						System.out.println("Numberof copies of books After selling:" + book.get(i).numOfCopies);
						if(book.get(i).numOfCopies == 0)
						{
							System.out.println("Books not available currently");
							book.remove(i);
						}
						break;
					}
				}
			}
			else
			{
				System.out.println("There are no books in the Book Store...... Move on with ordering....");
			}
		}
		void order(String isbn, int numOfCopies)
		{ 
			if(!book.isEmpty())
			{
				for(int i = 0; i < book.size(); i++)
					{
						if(book.get(i).isbn.equals(isbn))
							{
								System.out.println("Book found....... increasing the count");
								book.get(i).numOfCopies = book.get(i).numOfCopies+1;
								break;
							}
					}
			}
			else
			{
				System.out.println("Creating space for the new book");
				System.out.print("\nEnter the author name :");
				String author = sc.nextLine(); 
				System.out.print("\nEnter the BookTitle :");
				String bookTitle = sc.nextLine(); 
				book.add(new Book(bookTitle,author,isbn,numOfCopies));

			}
		
				

		}
		void display()
		{
			if(book.isEmpty())
			{
				System.out.println("There are no books in the Book Store .....");
			}
			else
			{
				for(int i=0;i<book.size();i++)
				{
					
				    book.get(i).display();
				    
				}
			}
		}

	}


public class BookStoreApp {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
	
		/* Create a book store application which will help a book store to keep the record of its books. For each 
		 book, the application will have the Book Title, Book Author, Book ISBN along with the number of copies 
		 for each book. The system will allow you to display all books, order new/existing books and sell books. With
		 sell or order of existing books, number of copies will decrease/increase. With order of new book, a new book
		 entry will be added to the system. The system will display a menu on the screen for the user to choose from. 
		 Here is the menu.
		 Enter “1”, to display the Books: Title – Author – ISBN - Quantity. 
		 Enter “2”, to order new books.
		 Enter “3”, to sell books. 
		 Enter “0”, to exit the system.*/
		
		BookStore b1= new BookStore();
		while(true)
		{
			System.out.println("\nEnter “1”, to display the Books: Title – Author – ISBN - Quantity");
			System.out.println("Enter “2”, to order new books.");
			System.out.println("Enter “3”, to sell books.");
			System.out.println("Enter “0”, to exit the system.");
			
			int choice = sc.nextInt();
			sc.nextLine();		
		
			if(choice == 1)
			{
				
				b1.display();
			}
			
			else if(choice == 2)
			{
				System.out.print("Enter the Book ISBN number :");
				String ISBN = sc.nextLine();
			
				System.out.print("\n Enter the number of copies :");
				int numOfCopies = sc.nextInt();
				sc.nextLine();
				
				b1.order(ISBN, numOfCopies);
				
			}
			else if(choice == 3)
			{
				System.out.println("Enter Book Name :");
				String bookTitle = sc.nextLine();
				System.out.print("\n Enter the number of copies :");
				int numOfCopies = sc.nextInt();
				
				b1.sell(bookTitle, numOfCopies);
				
				System.out.println("Do you want to sell another book? : Enter y / n");
				
				String ans = sc.next();
				if(ans=="y")
				{
					System.out.println("Enter Book Name:");
					bookTitle = sc.nextLine();
					
					System.out.print("\n Enter the number of copies :");
					numOfCopies = sc.nextInt();
					b1.sell(bookTitle, numOfCopies);

				}else { 
					System.out.println("Moving to main menu");
				}
			}
			else if(choice == 0)
			{
				System.out.println("Exiting");
				System.exit(0);		
								
			}
			else
			{
				System.out.println("Wrong Choice.... Try again");
			}

		
		}
}
}
