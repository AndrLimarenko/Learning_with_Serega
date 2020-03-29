package Task_2;

public class Lesson_2 {
    public static void main(String[] args) {
        int array[] = new int[20];
        System.out.println("Original array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("Reverted array: ");
        revertArray(array);
    }
    public static void revertArray(int arr[]){
        int revarray [] = new int [20];
        for (int i=arr.length-1; i>=0; i--){
            revarray[i]=arr[i];
            System.out.print(revarray[i]+" ");
        }
    }
}
