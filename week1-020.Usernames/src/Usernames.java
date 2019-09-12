
import java.util.Scanner;

public class Usernames {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your username: ");
        String username = reader.nextLine();
        System.out.print("Type your password: ");
        String password = reader.nextLine();
        reader.close();
        
        if (username.equalsIgnoreCase("alex") && password.equalsIgnoreCase("mightyducks"))
        {
            System.out.println("You are now logged into the system!");
            
        }
        
        else if (username.equalsIgnoreCase("emily") && password.equalsIgnoreCase("cat"))
        {
            System.out.println("You are now logged into the system!");
        }
        
        else
        {
            System.out.println("Your username or password is invalid!");
        }

    }
}
