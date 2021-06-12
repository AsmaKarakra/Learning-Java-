
//Getters and Setters 


/* What is a getter and setter in Java?

It is a certain method that we can put inside our classes that allow us to control how other programs 
can access and program those classes 

- getters and setters basically act as a middle man

- Example: 
			
			someone creates an object from a class we created 
			
			they want to set a specfic value in that object or get a specifc value in that object
			
			getters and setters act as a middle man 
			
			
			*/ 
			
			

// creating a public class for a movie 

public class Movie {
	
	String title; 
	
	String director; 
	
	String rating; 
	
}

	//constructor to create a movie class 
	public Movie(String title, String Director, String rating) {
		
		this.tile = title; 
		this.director = director; 
		this.rating  = rating; 
		
	} 
	
// in our main method 

public class App {
	
	public static void main(String[] args) {
		
		Movie movie1 = new Movie("The Avenges", "Joss Whedon", "PG-13"); 
		
		Movie movie2 = new Movie("Step Brothers", "Adam Mckay", "R"); 
	} 
	
} 

/* The problem with this class is that we can the user making the object can set it to anything they want
like for example, the rating can be set to "dog" 
		
	/* we can create a setter to control what we put in the rating 


- A setter is a method an outside program will use in order to modify the rating attrubite

usually created inside of class */ 


		
		public Movie(String title, String Director, String rating) {
		
		this.tile = title; 
		this.director = director; 
		this.rating  = rating; 
		}
		
		
		//Setter goes here 
		
		
		public void setRating(String rating) {
			
			// make if statement to check is conditon falls within 
			
			if(rating.equals("G") || rating.equals("PG") || rating.equals("R") {
			this.rating = rating; } 
			
			else {
				
				this.rating = "NR"; 
				
			} 
			
			
			 //allowing user to set rating but we controlling what ratings are valid to set 
			 
			 
			// so now if we take the above main method and set a movie to rating "DOG"
			
			
public class App {
	
	public static void main(String[] args) {
		
		Movie movie1 = new Movie("The Avenges", "Joss Whedon", "PG-13"); 
		
		Movie movie2 = new Movie("Step Brothers", "Adam Mckay", "R"); 
		
		movie1.setRating("Dog"); 
		System.out.println(movie1.rating); // output will be "NR" 
		
		
		// the "setRating" method is a middle man between how we can set the data 
	} 
	
} 
		
			
			

			
	} 
		
	

// The problem now remains which is that we can still access the String Rating in our class def and can 
// alter it that way. 
		
	public class Movie {
	
	String title; 
	
	String director; 
	
	String rating; 
	
}
				
	
		
		
		
		// we need to utalize "private" keyword 
		
}


public class Movie {
	
	String title; 
	
	String director; 
	
	private String rating; 
	
	// private = can only be accessed by the movie class 
	
	/* not going to be able to access "rating" attribute directly through like a main method */ 
	
	
}

		
	// we can also control how users change and access certain attributes 


	// we can no longer access the .rating in the following function
	
	System.out.println(movie1.rating); // because we set it to private eariler 
	
	
	
	// create a getter method to allow us to access 
	
	public String getRating() {
		
		return rating; }
	
	
	
	// now we can just go back into our main method and say get rating 
	
	
	movie1.setRating("Dog"); 
	
	System.out.println(movie1.getRating()); 
	
	// we can do this with all the attrubites of movie // 
	
