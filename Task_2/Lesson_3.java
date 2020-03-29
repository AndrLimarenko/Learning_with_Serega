package Task_2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Lesson_3 {
    public static void main(String[] args) {
        int array[] = new int[20];
        System.out.print("Original array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("2 max values are:");
        getTwoMaxElements(array);
        for (int z : getTwoMaxElements(array)) {
            System.out.print(z + " ");
            ;
        }
    }

    public static int[] getTwoMaxElements(int arr[]) {
        int resultArray[] = new int[2];
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int m = 0; m < 2; m++) {

            resultArray[m] = arr[m];
        }
        return resultArray;
    }
}
