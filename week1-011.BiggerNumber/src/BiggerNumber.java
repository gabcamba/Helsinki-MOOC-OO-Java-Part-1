
import java.util.Scanner;

public class BiggerNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number: ");
        int num1 = Integer.parseInt(reader.nextLine());
        System.out.println("Type another number: ");
        int num2 = Integer.parseInt(reader.nextLine());
        
        System.out.println("The bigger number of the two numbers given was: " +Math.max(num1, num2));
        
        
        // Implement your program here. Remember to ask the input from user
    }
}
