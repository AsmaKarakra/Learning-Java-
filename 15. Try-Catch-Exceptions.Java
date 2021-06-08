 // Try / Catch & Exceptions 
 
 /* allows us to monitor for specifc errors in our program and we can handle them */ 
 
 // Handle error and allows our program to continue 
 
 

	try {
			//  Block of code to try
	}
	catch(Exception e) {
			//  Block of code to handle errors
	}


 
 
// Here we have a program that takes in a user input as a double 


 import java.util.Scanner; // import scanner 
 
 public class App {
	 public static void main(String[] args) {
		 
		 
		 Scanner keyboardInput = new Scanner(System.in); 
		 System.out.println("Enter a number: "); 
		 
		 //define user input as a double 
		 
		 double num = keyboardInput.nextDouble(); 
	 System.out.println(num) } 
 } 





Syntax: 


	try {
			//  Block of code to try
	}
	catch(Exception e) {
			//  Block of code to handle errors
	}

// if we inpt a letter in the user input, the program will terminate - we can fix this by using try catch blocks 

// Directions before try and catch exception
Scanner keyboardInput = new Scanner(System.in); 
System.out.println("Enter a number: "); 
		 
try {
	 double num = keyboardInput.nextDouble(); 
	 System.out.println(num); 
	
} catch(Exception e) {
	 System.out.println("Invalid input"); 
	
} 

// Combining everything together // 


 import java.util.Scanner; // import scanner 
 
 public class App {
	 public static void main(String[] args) {
	
	Scanner keyboardInput = new Scanner(System.in); 
	System.out.println("Enter a number: "); 
		 
try {
	 double num = keyboardInput.nextDouble(); 
	 System.out.println(num); 
	
} catch(Exception e) {
	 System.out.println("Invalid input"); 
	
} 
	
	 }
 }
 
 
 
 /* what is "Exception e" ? 
- a class inside java 

 - would just tell us what went wrong if we tell our program to print the exception 

-  
 System.out.println("Exception e); 
 
 
 */ 



// What happens when we have two diff pieces of code throwing different exceptions? 

// 			- We can specify which type of exception we want to catch 

class App {
	
	public static void main(String [] args) {
		
		System.out.print("Enter a number: "); 
		
		
		try {
			
			double num = keyboardInput.nextDouble(); 
			system.out.println(num); 
			
			
			// will catch if input is out of bounds 
			
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e); 
			
			//will catch if input is invalid data type 
			
		} catch(InputMismatchException e) {
			System.out.println("Invalid Input); 

	} 
	}
}

		} 
		
		
		
// Other problems that can go wrong in our program are: errors 

/* What is the difference between an exception and an error ? 

- An error is more serious 

- exception: not serious like an error 
- error: you dont want to catch this - something big is wrong with the program
we usually cant recover from an error 



*/ 


// will catch any error that goes wrong with the program 

try {
  //  Block of code to try
}
catch(error e) {
  //  Block of code to handle errors
}




// will catch any error or any exception that goes wrong with the program 

try {
  //  Block of code to try
}
catch(Throwable e) {
  //  Block of code to handle errors
}
