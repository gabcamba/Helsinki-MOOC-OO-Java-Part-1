import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        
        Scanner reader = new Scanner(System.in);
        int sum = 0, count = 0, even = 0 , odd = 0, mod;
        double average = 0;
        System.out.println("Type numbers: ");
        while(true)
        {
            int input = Integer.parseInt(reader.nextLine());
            mod = input % 2;
            
            if (input == -1)
            {
                System.out.println("Thank you and see you later!");
                break;
            }
            
            if(mod == 0)
            {
                even++;
            }
            
            if (mod != 0)
            {
                odd++;
            }
            
            
            
            sum += input; 
            count++;
            average = (double) sum/count;
        }
        
        System.out.println("The sum is " +sum);
        System.out.println("How many numbers: " +count);
        System.out.println("Average: " +average);
        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " +odd);

    }
}
