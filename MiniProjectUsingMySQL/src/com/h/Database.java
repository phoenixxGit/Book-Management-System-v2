package com.h;
import java.util.List;

public interface Database {

		public List<Book> viewAll();
		public void insertBook(Book b);
	    public void deleteBook(int id);
	    public void findBook(String title);
	    public void updatePrice(int id, int price);
	    
	}

