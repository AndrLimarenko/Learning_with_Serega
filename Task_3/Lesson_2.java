package Task_3;

public class Lesson_2 {
    public static void main(String[] args) {
        String s = "Get a modern feel  with a smudge-resistant only for $2.50, you can finish now";
        System.out.println("Original text: " + s);
        Double prize = getdoubleValue(s);
        incDoubleValueAndPrint(prize, s);
    }

    public static double getdoubleValue(String text) {
        String temp2 = text.substring((text.indexOf("$") + 1), text.indexOf(","));
        double value = Double.parseDouble(temp2);
        return value;
    }

    public static void incDoubleValueAndPrint(double data, String str) {
        String s1 = str.substring(0, str.indexOf("$") + 1);
        String s2 = str.substring(str.indexOf("$") + 4);
        data = data * 4;
        System.out.println("Changed text: ");
        System.out.println(s1 + data + s2);
    }
}
