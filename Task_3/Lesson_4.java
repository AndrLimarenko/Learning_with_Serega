package Task_3;

import java.util.ArrayList;

public class Lesson_4 {
    public static void main(String[] args) {
        String str = "Get a modern feel  with a smudge-resistant only for $4.50 $2.50, you can finish now";
        System.out.println("Original string: " + str);
        String s = str.trim();
        s = s.replaceAll("( )+", " ");
        System.out.println("2nd double value is: " + getSecondDoubleValue(s));
    }

    public static double getSecondDoubleValue(String text) {
        String[] arr = text.split(" ");
        ArrayList<Double> res = new ArrayList<Double>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].contains("$")) {
                res.add(Double.parseDouble(arr[i].substring(1, 4)));
            }
        }
        return res.get(1);
    }
}
