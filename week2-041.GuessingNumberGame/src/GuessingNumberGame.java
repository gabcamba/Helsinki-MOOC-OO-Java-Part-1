
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();
        int guess = 0;
        while (true)
        {
            System.out.print("Guess a number: ");
            int number = Integer.parseInt(reader.nextLine());
            
            if (number < numberDrawn)
            {
                guess++;
                System.out.println("The number is greater, guesses made: " +guess);
            }
            
            else if (number > numberDrawn)
            {
                guess++;
                System.out.println("The number is lesser, guesses madde: " +guess);
            }
            
            else if (number == numberDrawn)
            {
                System.out.println("Congratulations, your guess is correct!");
                break;
            }
        }
        // program your solution here. Do not touch the above lines!
        
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
