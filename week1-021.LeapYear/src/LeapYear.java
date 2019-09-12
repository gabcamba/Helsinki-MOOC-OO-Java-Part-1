
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a year: ");
        double year = Double.parseDouble(reader.nextLine());
        
        double yearDivideFour = year % 4;
        double yearDivideHundred = year % 100;
        double yearDivideFourHundred = year % 400;
        
        System.out.println(yearDivideFour );
        System.out.println(yearDivideHundred);
        System.out.println(yearDivideFourHundred);
        
        if (yearDivideFour == 0 && yearDivideHundred != 0 && yearDivideFourHundred != 0)
        {
            System.out.println("The year is a leap year.");
        }
        
        else if (yearDivideFour == 0 && yearDivideHundred == 0 && yearDivideFourHundred == 0)
        {
            System.out.println("The year is a leap year.");
        }
        
        else
        {
            System.out.println("The year is not a leap year.");
        }
                

    }
}
