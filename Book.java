package com.guvi.task3;

public class Book {
	private int bookID;
	private String title;
	private String authorName;
	private boolean isAvailable;
	//constructor
	public Book(int bookID, String title, String authorName) {

		this.bookID = bookID;
		this.title = title;
		this.authorName = authorName;
		isAvailable=true;
	}
	public int getBookID() {
		return bookID;
	}
	public void setBookID(int bookID) {
		this.bookID = bookID;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public boolean isAvailable() {
		return isAvailable;
	}
	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	 public String toString() {
	        return "Book ID: " + bookID + ", Title: " + title + ", Author: " + authorName + ", Available: " + isAvailable;
	    }
	public void displayBooks() {
		System.out.println("Book ID : "+bookID);
		System.out.println("Title : "+title);
		System.out.println("Author Name : "+authorName);
	}
	
}
