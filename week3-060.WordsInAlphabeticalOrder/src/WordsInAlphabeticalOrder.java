
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInAlphabeticalOrder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> wordList = new ArrayList<String>();
        
        while (true)
        {
            System.out.print("Type a word: ");
            String word = reader.nextLine();
            
            if (word.isEmpty())
            {
                break;
            }
            
            wordList.add(word);
        }
        Collections.sort(wordList);
        System.out.println("You typed the following words: ");
        for (String words : wordList)
        {
            System.out.println(words);
        }
        // create here an ArrayList
    }
}
