import java.util.Scanner;

public class ReversingName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = reader.nextLine();
        System.out.print("In reverse order: ");
        int endIndex = name.length() -1;
        
        while (endIndex >= 0)
        {
            System.out.print(name.charAt(endIndex));
            endIndex--;
        }
    }
}
