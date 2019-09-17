import java.util.Scanner;

public class FirstCharacters {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String name = reader.nextLine();
        
        if(name.length()>3)
        {
            int i = 0;
            int num = 1;
            while(i<3)
            {
                System.out.println(num +". character: " +name.charAt(i));
                i++; num++;
            }
        }
    }
}
