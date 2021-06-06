
 //Working with Strings in Java 
 
 class App {
	 public static void main (String[] args) {
	 System.out.println("Hey"); } 
 }// this is a string in Java
	 
	 
// creating a special character inside string using <\> backslash. 

//example - create a new line inside our string using <\n> 

class App {
	public static void main (String [] args) {
	System.out.println("Asma \n hates Java") }
	
}

//output: Asma 
		//hates Java

// Using String Methods // 

String phrase = "Boeing Acadmey"; 

// method to convert string to all upper case 

System.out.println(phrase.toUpperCase()); //The method will need to have () after it like <toUpperCase()> 

//return number of elements within our String 

System.out.println(phrase.length()); 

// <contains()> method can actually take in information and will be able to tell us wether or not our string contains
// the information that was inputted 

System.out.println(phrase.contains("Acadmey")); 

// output will be True



// <charAt()> Takes in an index number and returns the value at the given index 


{
	System.out.println(phrase.charAt(1)); //returns O in the string "Boeing Academy" 

}// <indexOf()> is the oopsite of the charAt method 

{
	System.out.println(phrase.indexOf("O")); } //will return index 1 
