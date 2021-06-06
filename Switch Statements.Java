
// Switch Statements in Java // 


// switch can allow us to make decisions:

// when you're trying to compare one value to a lot of other values 

public class App {
	
	public static void main{ 
	
	
	// create a function that will map a number to a day of the week
	
	
	/* 0: Sunday 
	 1: Monday
	 2: Tuesday
	 3: Wednesday 
	 4: Thursday
	 5: Friday
	 6: Saturday */ 
	} 
	
	// create another function that takes in an input of number and returns a string that outputs the day
	
	public static String getDayName(int dayNum) {
		
		// we want to convert dayNum to Day String 
		
		String dayName = " " ; 		// set dsyName to empty string for now 
		
		// we can convert using if statmeents
		
		if(dayNum == 0) {
		day = "Monday" }
		
		
		// we would need to repeat this 7 different times. 
		
		return dayName; //Our function will return the dayName 
	
	
		/* if we were to rewrite our function using switch statmenets, we would be able to 
		
			compare our value to a bunch of other different values easily */ 
			
			
	} 
} 


// using our function to map using switch statmenets 



	/* 0: Sunday 
	 1: Monday
	 2: Tuesday
	 3: Wednesday 
	 4: Thursday
	 5: Friday
	 6: Saturday */ 
	
	
	class app {
		
		public static void main(String[] args) { 
		
		
		 System.out.print(dayName(3)); // this would output Wednesday

		
		} 
		
		
		public static String dayName(int NumDay) {
			
			String dayName = " " ; 
			
			/* switch( < Variable you want to compare > ) {
				
				//start check diff conditions inside of switch statements here 
				
				case < value of variable you want to compare to > : 

							<variable we're comparing against> = "value of variable we're comparing against" 
							
					break; <tell switch statement you're done using break 		*/ 
			
			public static String dayName(int dayNum) {

        String dayName = " ";

			/* switch( < Variable you want to compare > ) {

				//start check diff conditions inside of switch statements here

				case < value of variable you want to compare to > :

							<variable we're comparing against> = "value of variable we're comparing against"

					break; <tell switch statement you're done using break 		*/

        switch (dayNum) {

            case 0:
                dayName = "Sunday"; // in the case that dayNum = 0, we want to set DayName to Sunday

                break;

            case 1:
                dayName = "Monday";
                break;

            case 2:
                dayName = "Tuesday";
                break;

            case 3:
                dayName = "Wednesday";
                break;

            case 4:
                dayName = "Thursday";
                break;

            case 5:
                dayName = "Friday";
                break;

            case 6:
                dayName = "Saturday";
                break;

        }


        return dayName;


    }
}
