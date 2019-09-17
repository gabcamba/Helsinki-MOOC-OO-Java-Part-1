import java.util.Scanner;

public class TheEndPart {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a word: ");
        String word = reader.nextLine();
        System.out.println("Length of the end part: ");
        int length = Integer.parseInt(reader.nextLine());
        int lastIndex = word.length();
        int firstIndex = lastIndex - (length);
        System.out.println("Result: " +word.substring(firstIndex, lastIndex));
    }
}
