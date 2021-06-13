
/* Main Methods and Non- Static Methods */ 


/* creating methods within our main method 

Why are we using the static keywrod with main method?

When we have the main method set to static (which has to be static to work), it can only call the 

methods inside only if they're static 


we want to make functions static if we want to call them in our main function.



What if we want to use a method but not set it to static ?

We can use it but we would need to create an instance inside app class 





*/ 
	
	
		// with static on both functions 
		
		public class App {
			
			public static void main(String[] args) {
				
				sayHi("Mike"); 
				
			} 
			
		
		
		
		public static void sayHi(String name) {
			
		System.out.println("Hello" + name); } 
		
		
		} 
		
		
		
		
		// without static on both functions 


		public class App {
			
			public static void main(String[] args) {
				
				App myApp = new App(); 
				
				myApp.sayHi("Mike"); 
				
			} 
			
		
		
		
		public void sayHi(String name) {
			
		System.out.println("Hello" + name); } 
		
		
		} 
