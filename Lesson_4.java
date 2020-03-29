package Task_2;

public class Lesson_4 {
    public static void main(String[] args) {
        int array[] = new int[10];
        System.out.println("Original array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("Делятся на 2 но не делятся на 3 чисел: " + checkDivideFor3Or4(array));
    }

    public static int checkDivideFor3Or4(int arr[]) {
        int resultCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] % 2 == 0) & (arr[i] % 3 != 0)) {
                resultCount++;
            }
        }
        return resultCount;
    }
}
