//write a java program to Create an array with the values (1, 2, 3, 4, 5, 6, 7) and shuffle it.
import java.util.Arrays;
public class Shuffle {

    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 5, 6, 7};
        shuffle(array);
        System.out.println("Shuffled Array: " + Arrays.toString(array));
    }

    private static void shuffle(Integer[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            int j = (int) (Math.random() * (i + 1));
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
}

