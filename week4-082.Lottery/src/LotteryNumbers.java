import java.util.ArrayList;
import java.util.Random;
 
public class LotteryNumbers {
    private ArrayList<Integer> numbers;
    private Random random = new Random();
 
    public LotteryNumbers() {
        // Draw numbers as LotteryNumbers is created
     
        this.drawNumbers();
    }
 
    public ArrayList<Integer> numbers() {
        return this.numbers;
    }
 
    public void drawNumbers() {
        // We'll format a list for the numbers
        this.numbers = new ArrayList<Integer>();
        int i = 0;
        while (i <= 6)
        {
            int number = random.nextInt(39) + 1;
            if(!containsNumber(number))
            {
                numbers.add(number);
                i++;
            }
            
            
        }
        // Write the number drawing here using the method containsNumber()
    }
 
    public boolean containsNumber(int number) {
        if (numbers.contains(number))
                {
                    return true;
                }
        // Test here if the number is already in the drawn numbers
        return false;
    }
}