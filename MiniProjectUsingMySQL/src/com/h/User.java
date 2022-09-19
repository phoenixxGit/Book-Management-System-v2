package com.h;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class User {

	public static void main(String[] args) throws SQLException{
		// TODO Auto-generated method stub
		int choice; 

		Scanner sc = new Scanner(System.in);
		String yesOrNo = "y";
     
	 while(yesOrNo.equals("y")) {
		 
	            System.out.println("Press 1 to Display all Books");
	            System.out.println("Press 2 to Insert a Book");
	            System.out.println("Press 3 to Delete a Book");
	            System.out.println("Press 4 to Update a Book's Price");
	            System.out.println("Press 5 to Find a book by title");
	            System.out.println("Press 6 to Exit\n \n ");
	            
	            System.out.println("Make your choice :\n");
	            choice = sc.nextInt();
	            BookDAO Library = new BookDAO();
	            System.out.println();
	            switch (choice) {
	            case 1:
	            	List<Book> b = Library.viewAll();
	            	for(int i=0; i<b.size(); i++) {
	            		System.out.println(b.get(i));
	            	}
	            	System.out.println();
	            	break;
	            case 2:
	            	System.out.println("\nEnter Book ID :");
	            	int id = sc.nextInt();
	            	System.out.println("\nEnter Book Title :");
	    			String title = sc.next();
	    			System.out.println("\nEnter Book Author :");
	    			String author = sc.next();
	    			System.out.println("\nEnter Book Price :");
	    			int price = sc.nextInt();
	    			Book b1 = new Book(id,title,author,price);
	    			Library.insertBook(b1);
	    		    break;
	            case 3:
	            	System.out.println("Enter Book ID :");
	            	int id1 = sc.nextInt();
	            	Library.deleteBook(id1);
	            	break;
	            case 4:
	            	System.out.println("Enter Book ID :");
	            	int id2 = sc.nextInt();
	            	System.out.println("Enter new Price :");
	            	int price1 = sc.nextInt();
	            	Library.updatePrice(id2, price1);
	            	break;
	            case 5:
	            	System.out.println("Enter Book Title :");
	            	String title1 = sc.next();
	            	Library.findBook(title1);
	            	System.out.println();
	            	break;
	            case 6:
	            	System.exit(0);
					break;
	            } 

	    }
	  	sc.close();
	}
}


