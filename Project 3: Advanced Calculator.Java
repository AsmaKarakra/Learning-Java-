import java.util.Scanner;

class calcuator {

    public static void main(String[] args) {

        Scanner keyboardInput = new Scanner(System.in);

        System.out.print("Enter a number: ");

        double num1 = keyboardInput.nextDouble();

        System.out.print("Enter an operator:  ");

        String op = keyboardInput.next(); // .next() just grabs the first thing they entered
        // .next() does not worry about format type


        System.out.print("Enter another number: ");

        double num2 = keyboardInput.nextDouble();


        if (op.equals("+")) {
            System.out.print(num1 + num2);
        } else if (op.equals("-")) {
            System.out.print(num1 - num2);
        } else if (op.equals("*")) {
            System.out.print(num1 * num2);
        } else if (op.equals("/")) {
            System.out.print(num1 / num2);
        }
    }
}




