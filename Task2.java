import java.util.Arrays;

public class Task2 {
    
    public static void main(String[] args) {
        int[] arr = {13, 51, 9, 31, 6, 82};

        System.out.println("Исходный массив: " + Arrays.toString(arr));
        System.out.println("Отрицательный массив: " + Arrays.toString(getNegArr(arr)));
    }

    public static int[] getNegArr(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = -1 * array[i];
        }

        return array;
    }
}