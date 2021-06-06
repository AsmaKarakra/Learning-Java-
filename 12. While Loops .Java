// while loops in Java // 


/* a while loop is a strucutre inside our java code that allows us to execuate a condition as long as
	a certain condition that we want is met */ 
	
	
	// sekeleton of while loop // 
	
	/* 
	
		while ( < condition goes here > ) {
			
		code to be execuated as long as condition in while loop is true } 			*/ 
	
	
	
	
	public class App {
		
		public static void main(String [] args) { 
		
		
		int i = 1; // we will use this as an indexing variable 
    
    // while loop will check condition before execuating 
		
		while ( i <= 10) { 
		
			// code will continue until i reaches 10
			
			System.out.println(i); 
			
			i++; // this is the same as i = i + 1; 
			
			// this function will print out 1-10 on new lines 
		
		
		} 
	} 
} 
		


// we also have something called a "Do while Loop" 

public class App {
	
	public static void main(String [] args) {
		
		int i = 11; 
		
		do {
			
			System.out.println(i); 
			
		i++; } while (i <= 10); 



			// a while loop checks condition first 
			
			// a do while loop will execuate code first and then it will do the condition specified 





