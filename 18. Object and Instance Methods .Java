
//Object and Instance Methods //

// methods we can put inside of a class that can help a class become more powerful and perform specifc functions

// here we're using our student class once again 


public class Student {
	
	String name; 
	
	String major; 
	
	double gpa; 
	
	
	// this is again an initalize method 
	public Student(String name, String major, double gpa) {
		this.name = name; 
		this.major = major; 
		this.gpa = gpa; 
		
		
	
		
	} 
	
} 




public App {
	
	public static void main(String [] args) {
		
		// creating a new student object 
		
	Student mystudent = new Student("Mike", "Computer Science", 3.4); } 
	
		
		// now we have a student 
		
		// how do we figure out if the student is on the honor roll or not?
		
		// lets say honor roll would need to maintain a certain gpa. 
		
		/* we can create a method in our class object that would allow us to check if the student 
			is on the honor roll or not */ 

} 
		
		
		// we can create a method inside our student class to check if the student is on the honor roll 
		
	public class Student {
	
	String name; 
	
	String major; 
	
	double gpa; }
	
	
	// this is again an initalize method 
	public Student(String name, String major, double gpa) {
		this.name = name; 
		this.major = major; 
		this.gpa = gpa; 
		
		
	
	
	
		
	} 
	
	// method to check if student is on honor roll or not inside student class 
	
	// returns true and false 
	
	public boolean isOnHonorRoll() {
		
		
		// use information about the specific object 
		
		// honor roll is GPA 3.5 of above 
		
		/* < this > is reffering to the gpa defined in the class */ 
		
		if(this.gpa >= 3.5) {
			return true }
		
		return false; 
		
	} 
		// so now in your main method, you can check if the student is on the honor roll 
		
		
public App {
	
	public static void main(String [] args) {
		
		// creating a new student object 
		
	Student mystudent = new Student("Mike", "Computer Science", 3.4); 
	
	System.out.println(myStudent.isOnHonorRoll()); // ouput will be true or false value 
	
	//we're accessing our student through a print statment 
	
	} 
	
		
		
		
} 
	
