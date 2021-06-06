import java.util.Scanner;

class TestCode {

    public static void main(String[] args) {

        // Build a basic calculator in Java

        // User can enter two number and the program will add the number on the screen

        //utilize the Scanner

        Scanner keyboardInput = new Scanner(System.in); //predefined object System.in,
        // which represents the standard input stream.

        System.out.print("Enter your first number: ");

        double num1 = keyboardInput.nextDouble(); //Store the user input inside the double var num1


        System.out.print("Enter your second number: ");

        double num2 = keyboardInput.nextDouble(); //Store the user input inside the double var num2

        System.out.println(num1 + num2);
    }
}


