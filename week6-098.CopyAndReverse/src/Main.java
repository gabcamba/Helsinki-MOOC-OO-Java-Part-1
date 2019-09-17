
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write testcode here
        int[] original = {1, 2, 3, 4};
        int[] reverse = reverseCopy(original);

        // print both
        System.out.println("original: " + Arrays.toString(original));
        System.out.println("reversed: " + Arrays.toString(reverse));
    }

    public static int[] copy(int[] array) {
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        return newArray;
    }

    public static int[] reverseCopy(int[] array) {
        int[] newArray = new int[array.length];
        int j = 0;
        for (int i = array.length - 1; i >= 0; i--) {

            newArray[i] = array[j];
            j++;
        }

        return newArray;
    }
}
