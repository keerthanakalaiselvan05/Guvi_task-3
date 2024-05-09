package com.guvi.task3;

import java.util.Scanner;

public class BookManagementSystem {

	public static void main(String[] args) {
		
		Library library=new Library();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of books : ");	
		int noofbooks=sc.nextInt();
		Book[] books=new Book[noofbooks];//array object
		System.out.println("Enter the Book details -------");
		//getting input from the user
		 
		for(int i=0;i<noofbooks;i++)
		{
			System.out.println("Book : "+(i+1));
			System.out.println("Enter BookID : ");
			int bookID=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Title : ");
			String title=sc.nextLine();
			System.out.println("Enter AuthorName : ");
			String authorName=sc.nextLine();
			//book object 
			books[i]=new Book(bookID,title,authorName);
		}
		//to print all details of the book
		System.out.println("Book details : ");
		for(int i=0;i<noofbooks;i++)
		{
			library.addBook(books[i]);
			books[i].displayBooks();
			
		}
		library.displayBooks();
      	library.removeBook();
      	library.searchBook();
      	library.displayBooks();
      	sc.close();
	}
}

/*Output:
	    Enter the number of books : 
		2
		Enter the Book details -------
		Book : 1
		Enter BookID : 
		111
		Enter Title : 
		A song of India
		Enter AuthorName : 
		Ruskin Bond
		Book : 2
		Enter BookID : 
		222
		Enter Title : 
		Let Us Dream
		Enter AuthorName : 
		Pope Francis
		Book details : 
		Books added to the library  : A song of India
		Book ID : 111
		Title : A song of India
		Author Name : Ruskin Bond
		Books added to the library  : Let Us Dream
		Book ID : 222
		Title : Let Us Dream
		Author Name : Pope Francis
		Books in the library are----
		Book ID: 111, Title: A song of India, Author: Ruskin Bond, Available: true
		Book ID: 222, Title: Let Us Dream, Author: Pope Francis, Available: true
		Enter the book ID to remove :
		111
		Books removed from the library : A song of India
		Enter the book ID to Search :
		222
		Book found in the library: Book ID: 222, Title: Let Us Dream, Author: Pope Francis, Available: true
		Books in the library are----
		Book ID: 222, Title: Let Us Dream, Author: Pope Francis, Available: true
		*/
