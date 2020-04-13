package Task_3;

public class Lesson_3 {
    public static void main(String[] args) {
        String s = "Get a modern feel  with a smudge-resistant only for $2.50, you can finish now";
        System.out.println("Original string: "+s);
        String str = s.trim();
        str = str.replaceAll("( )+", " ");
        System.out.println(changeWordToUpperCase(2, str));
    }

    public static String changeWordToUpperCase(int number, String text) {
        String[] parts = text.split(" ");
        if ((number<0)|(number>=parts.length)) {
            return "number value is incorrect!";
        }
        else
            System.out.println("word " + (number + 1) + " in upper case: ");
        return parts[number].toUpperCase();
    }
}
