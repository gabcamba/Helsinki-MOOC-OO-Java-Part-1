
public class Greatest {

    public static int greatest(int number1, int number2, int number3) {
        int first = Math.max(number1, number2);

        return Math.max(first, number3);
    }

    public static void main(String[] args) {
        int result = greatest(2, 7, 3);
        System.out.println("Greatest: " + result);
        
    }
}
