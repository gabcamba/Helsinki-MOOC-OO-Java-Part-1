
public class Main {

    public static void main(String[] args) {
        // test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayAsStars(array);
    }

    public static void printArrayAsStars(int[] array) {

        for (int num : array) {
            int i = 1;
            while (i <= num) {
                System.out.print("*");
                i++;
            }
            System.out.println("");
        }

        // write code here
    }
}
