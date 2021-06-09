
// Constructors in Java // 

/* What is a constructor ? 

	- A special method that we can put inside a class which will allow us to give 
	class information when we create it. 
	
	
*/ 

// For example we have a book class 

public class Book { 

	String title; 
	
	String author; 
	
	int pages; 
	
	String language; 
	
	
} 

// then we created instances of the classes // 

Book book1 = new Book(); 

book1.title = "Harry Potter"; 
book1.author = "Jk Rowling"; 
book1.pages = 500; 
book1.language = "English"; 

Book book2 = new Book(); 
book2.title = "The 4 hour workweek"; 
book2.author = "Tim Ferris"; 
book2.pages = 300; 
book2.language = "English"; 

// this took almost 12 lines of code 

// what if we wanted to create 4-5 books? this would take a LOT of space 


//There is a better way to do this 

// we can pass in information as paramters within object - this is a constructor

// a constructor can also be an init method or intilaizer method 

// a constructor allows us to give our object default infomration when we create it 

public class Book {
	
	String title; 
	String author; 
	int pages; 
	String language; 
	
	// public < Name of class() > {
		
		// this constructor method will be linked to Book class defined above 
		
		// we're saying this constructor needs to have 4 parameters passed in to it 
		public Book(String title, String Author, int pages, String language) { 
	

			/* we need to now take the values that got passed in the constructor 
				and assign them to the values that were passed in */ 
				
				this.title = title; 
				
		// this <what got passed in class method> = <what got passed in constructor // 

			this.author = author;  
			this.pages = pages;
			this.language = language;
				
	
	} }
	
// now instead of doing this 

	
Book book1 = new Book(); 

book1.title = "Harry Potter"; 
book1.author = "Jk Rowling"; 
book1.pages = 500; 
book1.language = "English"; 


// we can now do this 

// public Book(String title, String Author, int pages, String language) // 

Book book1 = new Book("Harrry Potter", "Jk Rowling", 500, "English"); 
Book book2 = new Book("The 4 hour work week", "Tim Ferris", 300, "English"); 

System.out.print(book1.title); // this will print "Harry Potter" 
