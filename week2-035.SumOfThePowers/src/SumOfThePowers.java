
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type a number: ");
        int input = Integer.parseInt(reader.nextLine());
        int i = 0;
        int result = 0;
        while (i <= input)
        {
            result += (int)Math.pow(2, i);
            i++;
        }
        
        System.out.println("The result is " +result);

    }
}
