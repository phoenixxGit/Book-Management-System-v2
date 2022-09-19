package com.h;

import java.util.Objects;

public class Book implements Comparable<Book>{
	int id; 
	String title; 
	String author; 
	int price;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public Book() {
		super();
	}
	
	public Book(int id, String title, String author, int price) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(author, id, price, title);
	}
	
	@Override
	public boolean equals(Object obj) {
		Book b=(Book)obj;
		if(this.id==b.id && this.title.equals(b.title) && this.author.equals(b.author) && this.price==b.price )
	      return true;
		
	    return false;
	}
	
	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", author=" + author + ", price=" + price + "]";
	}
	
	@Override
	public int compareTo(Book o) {
		return this.getId() - o.getId();
		//return 0;
	}
	
	
	
	
}
