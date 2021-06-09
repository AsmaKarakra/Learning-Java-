
// Classes and Objects in Java // 

public class app {
	
	public static void main(String [] args) {
		
		// a method to represent data not able to be represented using data

		
		// Traditonal Way 
		
		String Student = "Mark"
		String StudentMajor = "Computer Science" 
		
} 
}


// a class would allow us to model a real world attribute inside our program 

// - create our own custom data type 


// start class name with capital letter 

public class Student {

	// what are some attributes to define a student in college? 
	
	String firstName; 
	
	String lastName; 

	double gpa; 
	
	String major; 
	
	int age; 
	
	boolean onProbation; 

}	// this is a student class - a specific for what a student should have 


// we can use this student class to define indiviudal students 

// go to another class/method and define ur students 


public class App {
	
	public static void main(String [] args) {
		
		// this is an actual student obkect that is an instance of a class 
		
		// this is the class with values inside 
		
		// <data type> <name of data type> = new <data type ()> ; //
		
		Student myStudent1 = new Student(); // empty student with no attributes
		
		myStudent1.firstName = "Jim"; 
		
		myStudent1.lastName = "Halpert"; 
		
		myStudent1.major = "Business"; 
		
		myStudent1.gpa = 2.3; 
		
		myStudent1.age = 24; 
		
		myStudent1.onProbation = false; 
		
		
		// we can print out attributes of our student
		
		System.our.println(myStudent1.firstName); 
		
		//output: "	Jim" - we can do the same with the last name 
		
		
		// we can also create another student object // 
		
		
		Student myStudent2 = new Student(); // empty student with no attributes
		
		myStudent2.firstName = "Asma"; 
		
		myStudent2.lastName = "Karakra"; 
		
		myStudent2.major = "Mechanical Engineer"; 
		
		myStudent2.gpa = 3.5; 
		
		myStudent2.age = 23; 
		
		myStudent2.onProbation = false; 
		
		System.our.println(myStudent2.firstName);  // access attributes to our student  


	}
}




// Model a book inside of our program 


// this is a class of a book 

class Book { 
	
	public static void main(String[] args) {
		
		// give book various attributes inside our program 
		
		String title; 
		
		String author; 
		
		int pages; 
		
		String language; 
		
		
	} 
} 

// this is an object of our book 

public class App {
	
	public static void main(String[] args ) {
		
		Book book1 = new Book (); 
		
		book1.title = "4 hour work week";
		
		book.authoer = "Tim ferris";
		
		book1.pages = 500;
		
		book1.language = "English;

	
	System.out.println(book1.title); // access instances of book class } 
} 
	} 
	


