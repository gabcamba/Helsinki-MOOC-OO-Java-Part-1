import java.util.Random;

public class PasswordRandomizer {
    private int length;
    private Random random;
    // Define the variables

    public PasswordRandomizer(int length) {
        this.length = length -1;
        random = new Random();
        // Initialize the variable
    }

    public String createPassword() {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        
        int i = 0;
        String password = "";
        while (i <= length)
        {
            int q = random.nextInt(25);
            password += alphabet.charAt(q);
            i++;
        }
        // write code that returns a randomized password
        return password;
    }
}
