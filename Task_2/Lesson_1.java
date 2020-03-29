package Task_2;

public class Lesson_1 {
    public static void main(String[] args) {
int array [] = new int[20];
        System.out.print("Original array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("Max value is: " + getMaxValue(array));
    }

    public static int getMaxValue (int arr []){
        int max = Integer.MIN_VALUE;
        for (int i=0; i<arr.length; i++){
            if (arr[i]>=max){
                max = arr[i];
            }
        }
        return max;
    }
}
