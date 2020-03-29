package Task_2;

public class Lesson_5 {
    public static void main(String[] args) {
        int array[] = new int[20];
        System.out.println("Original array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        checkMaxQuantity(array);
    }

    public static void checkMaxQuantity(int arr[]) {
        int countarray[] = new int[20];

        for (int i = 0; i < arr.length; i++) {
            countarray[i] = 0;
            int temp = arr[i];
            for (int j = i; j < arr.length; j++) {
                if (arr[j] == temp) {
                    countarray[i]++;
                }
            }
        }

        int maxCount = Integer.MIN_VALUE;
        int index = 0;
        for (int i = 0; i < countarray.length; i++) {
            if (countarray[i] > maxCount) {
                maxCount = countarray[i];
                index = i;
            }
        }
        System.out.println("Значение: " + arr[index] + " Встречается больше всего раз: " + maxCount);
    }
}
