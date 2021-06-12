
// Static Class Attributes //


/* An attribute in a class that is the same for all objects of the class */ 


/* define static variable within that class and all objects within class will be able to access and 

 have same value */ 


/* Example: Song Object */ 


public class song {
	
	
	// Song Object 
	private String title; 
	
	private String artist; 
	
	private int length; 
	
}
	
	
	// Song Constructor 
	public Song(String title; String artist; int length); {
		this.title = title; 
		this.arist - artist; 
		this.length = length; } 
		
		
	// getters and setters - always use when you're creating getters and setters 
	
	public String getTitle() {
		return title; 
	}
	
	
	// void means function should not have a return value 
	
	public void setTtile(String title) {
		this.title = title; 
		
	}
	
	
	public String getArtist() {
		return artist; }
	
	
	public void setArtist(String artist) {
		this.artist = artist; } 
	
	
	
	public int getLength() {
		return length; }
	
	
	
	public void setLength(int length) {
		this.length = length; } 
	
}
	
	
	// in our main fucntion, we want to create some songs:
	
	public class App {
		
		public static void main(String[] args) {
			
			Song hoilday = new Song("Hoilday", "Green Day", 200); 
			
			Song AmericanIdiot = new Song("American Idiot", "Green Day", 230); 
			
			
			// getter to print out artist and title 
			System.out.println(hoilday.getArtist());
			
		System.out.println(hoilday.getTitle()); } 
			
			/* a special attribute can be used across our class which will be the same for all of them */ 
			
			// Example 
		
	
	
	
	public class song {
	
	
	// Song Object 
	
	private String title; 
	
	private String artist; 
	
	private int length; 
	
	/* COUNTS HOW MANY SONG HAVE BEEN CREATED IN OUR PROGRAM 
	
	private static < data type > < name of variable > */ 
	
	private static int songsCount = 0; // same for all objects that we create from same song class 
	
	
	/* so now we can alter our constructor - remainder that our constructor gets called everytime we 
	create our object */ 
	
	public Song(String title; String artist; int length;) {
		this.title = title; 
		this.artist = artist; 
		this.length = length; 
		songsCount++; // increments everytime we create a new song
		System.out.println("Songs Count: " + songsCount); 
		
	} 
	} 
	
	
	// now in our main method: 
	
	public class App {
		
		public static void main(String[] args) {
			
			Song hoilday = new Song("Hoilday", "Green Day", 200); 
			
			Song AmericanIdiot = new Song("American Idiot", "Green Day", 230); 
			
			
			// we created these objects and now our prorgam will print out song count 1 and song count 2 
	
		} 
	} 
	
	// we can also create a getter method to get songs count // 

public int getSongsCount() {
	return songsCount; } 
	
	// in our main java method: 
	
	System.out.println(hoilday.getSongsCount());
 	System.out.println(americanIdoit.getSongsCount()); 
	
	//both will have the same output of "2" - access same song count 
	
