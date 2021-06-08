
/* Nested Loops 

a loop inside of a loop

- high level loop 
	- low level loop */ 
	
	
	 /* skeleton for a nested for loop 
		
		// top loop 
		for (int <variable 1> = starting number; <variable 1> <condition here (i < 3) ; variable 1 ++) {

			for (int variable 2 > = starting numnber ); <
	 
	 
	 
	 
	 */

public class App {

        public static void main(String[] args) {


            for (int i = 1; i < 3; i++) {

                for (int j = 0; j < 4; j++) {

                    System.out.println(" i = " + i + ", j = " +j);

                }
            }
        }
    }

/* output: 

// value for i is staying the same - first iteration for i loop, but j loops through fully 

 i = 1, j = 0
 i = 1, j = 1
 i = 1, j = 2
 i = 1, j = 3
 i = 2, j = 0
 i = 2, j = 1
 i = 2, j = 2
 i = 2, j = 3
 
*/ 

--------------------------------------------------------------------------------------------------------------------

// 2D Arrays // 


/* a 2D Array is just an array within an array 

skeleton of 2D array 

<data type here> [][] <name of 2D Array>  = new <data type> [ <number of rows we want in array> ] [ < number of columns> ] ; 


// we can also do it like this 

<data type> [] [] <name of 2D array > = new <data type> { 
	{1, 2, 3,}, 
		{4,5,6}, 
			{0} } 
*/ 

/* To Access the elements within the array 


	numberGrid[<row>][<column>] */ 


public class App {

        public static void main(String[] args) { 
		
		int [][] numberGrid = {
			{1, 2, 3}, 
				{4,5,6}, 
					{7, 8, 9}, 
						{0}, 
		}; 
		
		System.out.println(numberGrid[0][1]); //output will be 2 <first row> <second column> }
		} 
		} 
		
		
---------------------------------------------------------------------------------------------------------------------

/* Nested for loop that prints out 2D array */ 

public class App {

    public static void main(String[] args) {

        int[][] numberGrid = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {0},
        };


        // will loop through all of the rows inside our arrays

        for (int i = 0; i < numberGrid.length; i++) {


            // will loop inside every element inside the rows

            for (int j = 0; i < numberGrid[i].length; j++ ){


                // will print each element in row and column
                System.out.print(numberGrid[i][j]);
            }

        }
    }
}
