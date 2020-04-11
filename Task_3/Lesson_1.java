package Task_3;

public class Lesson_1 {
    public static void main(String[] args) {
        String s = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged.";
        System.out.println("Original string is: ");
        System.out.println(s);
        System.out.println();
        revertString(s);
    }

    public static void revertString(String str) {
        System.out.println("Reverted string is: ");
        for (int i = str.length() - 1; i >= 0; i--) {
            char symb = str.charAt(i);
            System.out.print(symb);
        }
    }
}
