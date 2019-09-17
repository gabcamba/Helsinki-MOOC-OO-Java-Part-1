
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write testcode here
        int[] values = {3, 2, 5, 4, 8};

        System.out.println(Arrays.toString(values));

        swap(values, 1, 0);
        System.out.println(Arrays.toString(values));

        swap(values, 0, 3);
        System.out.println(Arrays.toString(values));
    }

    public static int smallest(int[] array) {
        int smallestSoFar = array[0];

        for (int i : array) {
            if (i <= smallestSoFar) {
                smallestSoFar = i;
            }
        }
        return smallestSoFar;
    }

    public static int indexOfTheSmallest(int[] array) {
        int number = smallest(array);
        int index = 0;
        for (int i : array) {

            if (i == number) {
                return index;
            }
            index++;
        }
        return index;
    }

    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        int indexOfTheSmallestStartingFrom = index;
        for (int i = index; i < array.length; i++) {
            if (array[indexOfTheSmallestStartingFrom] > array[i]) {
                indexOfTheSmallestStartingFrom = i;
            }
        }
        return indexOfTheSmallestStartingFrom;
    }

    public static void swap(int[] array, int index1, int index2) {
        int num1 = array[index1];
        int num2 = array[index2];
        array[index1] = num2;
        array[index2] = num1;
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            swap(array, indexOfTheSmallestStartingFrom(array, i), i);
        }
    }
}
