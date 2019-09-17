
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Until what? ");
        int upperLimit = Integer.parseInt(reader.nextLine());
        int lower = 1;
        int sum = 0;
        
        while (lower <= upperLimit)
        {
            sum += lower;
            lower++;
        }
        
        System.out.println("Sum is " +sum);
        
        

    }
}
