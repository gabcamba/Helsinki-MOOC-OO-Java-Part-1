
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("How many values? ");
        int amountOfValues = Integer.parseInt(reader.nextLine());

        int[] values = new int[amountOfValues];

        System.out.println("Enter values:");
        for (int i = 0; i < amountOfValues; i++) {
            values[i] = Integer.parseInt(reader.nextLine());
        }

        System.out.println("Values again:");
        for (int i : values) {
            System.out.println(i);
        }
    }
}
