
// Interface Inheritance in Java // 


/* interface inheritance is a special type of inheritance in Java where we can define a template for a
	category of classes called an interface and can implment that interface in specific instances */ 
	
	
	/* an interface is essentially a template for a class to be used by other types of classes */ 
	
	
	// Example: Create animal class and then use that class to create like a dog 
	
	
	
	public interface Animal {
		
	} 
		
		// not the same as class in Java 
		
		// interface acts as a template for other classes 
		
		// classses are used to create a data type or model a real world entitty inside a class 
		
		/* sometimes you want to have groups of classes that are releated, like dog, cat, cow 
		
			those classes are all animals and releated.
			
			Interface will say all animals have this trait */ 
			
			
			
			
			public interface Animal {
				
				// these are things (attributes) that all animals will have

				
				// two methods given to animal interface
				// all animals should be able to speak and eat 
				
				
				public void speak(); //void = doesnt have a return value 
				
				public void eat(); 
				
				
				// now we need to implment the interface 
				
			} 
			
			
			
			// creating a Dog Class using interface // 
				
			public class Dog implements Animal {
				
				
				//@ Overide implments the method inside the Dog.Java class 
				
				
				@Override
				
				public void speak() {
					
				//TODO Auto-generated method stub 
				
				System.out.println("Woof, Woof"); 
				
				} 
				
				
				@Override 
				
				public void eat() {
					
					System.out.println("Eats Some Kibble"); 
					//TODO Auto-generated method stub 
					
				} 
				
				
			} 
			
			
			// we can also use the template to make a classs for a cow 
			
			
			public class Cow implements Animal { 
			
				// Adding implmented methods 
				
				@Override 
				
				public void eat() {
					System.out.println("Eats Grass"); 
				} 
				
				
				@Override 
				
				public void speak() {
					
					System.our.println("MOO, MOO!"); 
				} 
			} 
			
			
			
			
			
			// why is the animal interface so useful?
			
			
			public class App {
				
				public static void main(String [] args) {
					
					
					
					Animal myCow = new Cow(); // define using an interface not a class - Animal Data Type 
					
					myCow.eat(); 
					
					Animal myDog = new Dog(); // define using an interface not a class - Animal Data Type
					
					
					myDog.eat(); 
				} 
				
			} 
			
			
			
			
			public class App {
				
				public static void main(String [] args) {
					
					// can also create an array of animals 
					
					Animal [] animals = { 
					
						newCow(), 
						newDog(), 
					}; // can store 2 diff types of classes in array
					
					
					// can loop through all classes 
					
					
					for (int i = 0; i < animals.length; i++) {
						
						animals[i].eat(); // will print the eat function of each animal in our array
						
						animals[i].speak();
				} 
				
				
				/* we're storing diff objects in same array because they're all using the animal interface*/ 
				
			} 
			
			} 
