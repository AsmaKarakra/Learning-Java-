// Inheritance is when you extend features from one class into another class // 



// Here we have a chef class: 

public class Chef {
	
	public void makeChicken() {
		
		System.out.println("The chef makes a deliciouis chicken"); 
	} 
	
	public void makeSalad() {
		
		System.out.println("The chef makes a healthy salad"); 
		
	} 
	
	public void makeSpecialDish() {
		
	System.out.println("The chef makes bbq ribs!"); } 
} 


// in our main method 

public class App {
	
	public static void main(String [] args) {
		
		// create an instance of chef class = new chef object 
		
		Chef normalChef = new Chef(); 
		
		normalChef.makeChicken(); } } 
		
	/* OUTPUT: "The chef makes a deliciouis chicken!" 
	
	we can do the same for salad, and special dish 	*/ 
	
	
	// what if we wanted to model another type of chef in our program? 
	
	
	// we have a normal chef, but we want to create an italian chef // 
	
	
	
	
	
	public class ItalianChef { 

	// new italian chef class 
	
	
	// our italian chef can cook everything our nomral chef can cook, with an additon to other things
	
	// we can copy all methods manually but there is a better way to extend attributes from the other classes 
	
	
	} 
	
	
	public class ChineseChef { 
	
	// new chinese chef class 
	
	/* our chinese chef can cook everything our normal chef can cook with other things but 
		
		it cannot cook what our italian chef can cook like chicken parm */ 
	} 
	
	
	// we can use inheritance to extend methods in between certain classes // 
	
	
	// inheritance is when a certain java class can inherit methods from another class 
	
	
	// Can be done using "Extend" in java 
	
	
	// we want to extend chef into chinese chef class 
	
	public class ChineseChef extends Chef {
		
		// we are extending all the functionalites from the chef class \
		
	// by saying extend, all chinese chef will have function included in it automatically 
	
	// if we called a chineseChef.makeSalad(); on the main method, will print the chef makes a healthy salad // 
	
	} 
	
	
	// we can also include custom methods inside out class 
	
	public class ChineseChef extends Chef {
		
		public void makeFriedRice() {
			
			System.out.println("The Chef makes fried rice"); 
			
		} 
		
		
	} 
	
	// we can actually override methods so in the chef class we have 


	public class Chef {
 
	
	public void makeSpecialDish() {
		
	System.out.println("The chef makes bbq ribs!"); } 
} 



// in our chinese chef class, we can over ride the special dish to be orange chicken


public class ChineseChef extends Chef {
	
	public void makeSpecialDish() {
		System.out.println("The chef makes orange chicken!"); 
		
	} 
	
	// this will overide the make special dish method that we got from the chef class 
	
} 
