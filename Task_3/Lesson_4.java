package Task_3;


public class Lesson_4 {
    public static void main(String[] args) {
        String str = "Get a modern feel  with a smudge-resistant only for $4.50 $2.50, you can finish now";
        System.out.println("Original string: " + str);
        String s = str.trim();
        s = s.replaceAll("( )+", " ");
        System.out.println("Last double value is: " + getSecondDoubleValue(s));
    }

    public static double getSecondDoubleValue(String text) {
        String[] arr = text.split(" ");
        double res = 0;
        for (int i = arr.length - 1; i > 0; i--) {
            if (arr[i].contains("$")) {
                res = Double.parseDouble((arr[i]).substring(1, 5));
                break;
            }
        }
        return res;
    }
}
