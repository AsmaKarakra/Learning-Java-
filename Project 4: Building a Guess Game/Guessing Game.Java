
class Game {
    public static void main(String[] args) {

        // we want to define a secret word and the user must guess the secret word

        Scanner keyboardInput = new Scanner(System.in);

        String secertWord = "Pizza";

        String guess = " ";

        int numberofGuesses = 0;

        while (!guess.equals(secertWord) && numberofGuesses < 5) {

            System.out.print("Enter a Guess: ");
            guess = keyboardInput.nextLine();
            numberofGuesses++;


        }

        System.out.print("You Win!"); //this occurs when it exists out of the for loop
    }

}
