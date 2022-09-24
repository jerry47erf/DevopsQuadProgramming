import java.util.Scanner;

public class project {
    public static void
    guessingNumberGame()
    {
        Scanner sc = new Scanner(System.in);

        int number = 1 + (int)(100
                * Math.random());
        int K = 5;

        int i, guess;

        System.out.println("A number is chosen" + " between 1 to 100." + "Guess the number" + " within 5 trials.");
        for (i = 0; i < K; i++) {

            System.out.println("Guess the number:");
            guess = sc.nextInt();
            
            
        if (number == guess) {
                System.out.println("Congratulations!" + " You guessed the number.");
                break;
            }
            else if (number > guess
                    && i != K - 1) {
                System.out.println("The number is " + "greater than " + guess);
            }
            else if (number < guess
                    && i != K - 1) {
                System.out.println("The number is" + " less than " + guess);
            }
        }

        if (i == K) {
            System.out.println("You have exhausted" + " K trials.");

            System.out.println("The number was " + number);
        }
    }
    public static void
    main(String arg[])
    {
        guessingNumberGame();
        
    }
}   

// code for scorecard
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

    }
        String inputString;
        int total;
        int Score1;
        int Score2;
        int Score3;
        int sum;

        public void userInput () {
            inputString = JOptionPane.showInputDialog("Enter Test Score #1");
            Score1 = Integer.parseInt(inputString);
            inputString = JOptionPane.showInputDialog("Enter Test Score #2");
            Score2 = Integer.parseInt(inputString);
            inputString = JOptionPane.showInputDialog("Enter Test Score #3");
            Score3 = Integer.parseInt(inputString);
        }


        public void sumOfInput () {
            sum = Score1 + Score2 + Score3;
        }

        public int averageScore () {
            int average;
            average = (sum / 3);
            return average;
        }

        public void displayAverage () {
            JOptionPane.showMessageDialog(null, "Hello, your average score " + averageScore());
        }
