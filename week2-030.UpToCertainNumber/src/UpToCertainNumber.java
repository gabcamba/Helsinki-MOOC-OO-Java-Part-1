
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Up to what number? ");
        int limit = Integer.parseInt(reader.nextLine());
        int i = 1;
        
        while (i<=limit)
        {
            System.out.println(i);
            i++;
        }
       
        
        // Write your code here
        
    }
}
