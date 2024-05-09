package com.guvi.task3;

import java.util.Scanner;

public class Library {
	private Book[] books;
    Scanner sc=new Scanner(System.in);
	public Library()
	{
		this.books=new Book[5];
	}
	//method to add book
	public void addBook(Book book)
	{
	   for(int i=0;i<books.length;i++) {
		if(books[i]==null)
		{
			books[i]=book;
		    System.out.println("Books added to the library  : "+book.getTitle());
		    return;
	    }
	 }
	System.out.println("Library is full,cant add more books...");
	}
	//method to remove book
	public void removeBook()
	{
	System.out.println("Enter the book ID to remove :");
	int bookID=sc.nextInt();
	for(int i=0;i<books.length;i++)
	{
		if(books[i]!=null && books[i].getBookID()==bookID)
		{
			System.out.println("Books removed from the library : "+books[i].getTitle());
			books[i]=null;
			return;
		}
	}
	System.out.println("Book not found in the library....");
	}
	//method to search book
    public void searchBook() {
    	System.out.println("Enter the book ID to Search :");
    	int bookID=sc.nextInt();
        for (Book book : books) {
            if (book != null && book.getBookID() == bookID) {
                System.out.println("Book found in the library: " + book);
                return;
            }
        }
        System.out.println("Book not found in the library.");
    }
    //method to display books
	public void displayBooks()
	{
		System.out.println("Books in the library are----");
		for(Book book : books)
		{
			if(book!=null)
			{
		    System.out.println(book);
		    }
		}
	}
}