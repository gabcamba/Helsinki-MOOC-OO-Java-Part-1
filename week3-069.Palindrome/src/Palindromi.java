import java.util.Scanner;

public class Palindromi {

    public static boolean palindrome(String text) {
        int startIndex = text.length() -1;
        String palindrome = "";
        
        while (startIndex >= 0){
            char adj = text.charAt(startIndex);
            palindrome += adj;
            startIndex--;
        }
        
        if (text.equals(palindrome))
        {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a text: ");
        String text = reader.nextLine();   
        
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
