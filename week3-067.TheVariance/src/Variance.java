import java.util.ArrayList;

public class Variance {
    // Copy here sum from exercise 63 
    public static int sum(ArrayList<Integer> list) {
        int sum = 0;
        for (Integer i : list)
        {
            sum += i;
        }
        return sum;
    }
    
    // Copy here average from exercise 64 
    public static double average(ArrayList<Integer> list) {
        return ((double)sum(list) / list.size());
    }

    public static double variance(ArrayList<Integer> list) {
        
        double ave = average(list);
        int sum = sum(list);
        double variance = 0;
        
        for (Integer i : list)
        {
            variance += Math.pow((i - ave), 2);
        }
        
        variance = variance/(list.size() -1);
        
        return variance;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        
        System.out.println("The variance is: " + variance(list));
    }

}
