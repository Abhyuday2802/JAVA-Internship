import java.util.Scanner;
import java.util.Random;

public class NumberGuessGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int score = 0;
        int round = 1;

        System.out.println("HERE'S THE NUMBER GUESSING GAME\n");

        while(true) {
            System.out.println("----> ROUND " + round + " <----");

            int number = rand.nextInt(100)+1;
            int AttemptsAllowed = 5;
            int AttemptsTaken = 0;
            boolean guessedcorrectly = false;

            System.out.println("I Have Picked A Number Between 1 to 100.");
            System.out.println("You Have " + AttemptsAllowed + " Attemps To Guess The Number.");

            while(AttemptsTaken < AttemptsAllowed) {
                System.out.println("\nEnter Your Guess-> ");
                int guess = sc.nextInt();
                AttemptsTaken++;

                if(guess == number) {
                    System.out.println("HURRAY! YOU GOT IT IN JUST " + AttemptsTaken + "  Attempts.");
                    score++;
                    guessedcorrectly = true;
                    break;
                } else if (guess < number) {
                    System.out.println("IT'S TOO LOW! MAKE IT HIGH. ");
                } else {
                    System.out.println("IT'S TOO HIGH! MAKE IT LOW. ");
                }
                }

                if (!guessedcorrectly) {
                    System.out.println("\nTHERE IS NO ATTEMPTS LEFT! THE ACTUAL NUMBER WAS " + number);
                }

                System.out.println("\nYOUR CORRECT SCORE(THE ROUNDS YOU WON)--> " + score);

                System.out.println("\nWOULD YOU LIKE TO PLAY ANOTHER ROUND...? (IT'S AN YES OR NO): ");
                String choice = sc.next();

                if  (!choice.equalsIgnoreCase("yes")) {
                    break;
                }
                round++;
        }

        System.out.println(" GAME OVER! YOUR TOTAL SCORE IS " + score);
        System.out.println("THANKS FOR PLAYING THIS MIND TRICK GAME");
        sc.close();
    }
}