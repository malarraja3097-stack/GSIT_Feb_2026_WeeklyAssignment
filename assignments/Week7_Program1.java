package assignments;

import java.util.Scanner;

class Book
{
	 String title;
	 String author;

	 //static variable
	 static String libraryName = "Bangalore Central City Library";
	
	 // final variable
	 final int ISBN = 12345;

 
	 Book(String title, String author) 
	 {
	     this.title = title;
	     this.author = author;
	 }
	 void print() 
	 {
	     System.out.println("Title: " + title);
	     System.out.println("Author: " + author);
	 }
	 
		
	  public Book() 
	  {
	  
	  }
		 
	 //Overridden method
	 String getDescription() 
	 {
	     return "This is a physical book";
	 }
	//static method
	 static void showLibrary() 
	 {
	     System.out.println("Library: " + libraryName);
	 }
	 
}


class EBook extends Book {
	 int fileSize;
	 EBook(String title, String author, int fileSize) 
	 {
	     super(title, author);
	     this.fileSize = fileSize;
	 }
	 void print() 
	 {
	     super.print();
	     System.out.println("File Size: " + fileSize + "MB");
	 }


	 //Overriding method
	 String getDescription() 
	 {
	     return "This is an electronic book";
	 }
	}
public class Week7_Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EBook ebook = new EBook("Wings of Fire", "APJ", 5);
	    ebook.print();
	    System.out.println();
	    
	    Book b = new Book();
	    System.out.println(b.getDescription());
	    System.out.println(ebook.getDescription());
	    System.out.println();
	    
	    //calling static method
	    Book.showLibrary();
	    System.out.println();
	    
	    //calling final variable
	    System.out.println("ISBN: " + b.ISBN);
	     
	    //trying to modify the final variable
	    //b.ISBN = 99999;
	     
	    //String Methods 
	    Scanner sc = new Scanner(System.in);
		System.out.print("Enter book name: ");
		String input=sc.next();
		
	     System.out.println("Uppercase: " + input.toUpperCase());
	     System.out.println("Length: " + input.length());
	     System.out.println("Contains Java: " + (input.contains("Java")?true:false));
	 }
}
