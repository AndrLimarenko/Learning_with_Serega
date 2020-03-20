package Task_1;

public class Lesson_4 {
    public static void main(String[] args) {
        String d = "Sunday";
        isHoliday(d);
        d = "Tuesday";
        isHoliday(d);
        d = "Friday";
        isHoliday(d);
        d = "Saturday";
        isHoliday(d);
    }

    public static void isHoliday (String day){
        if (day.equals("Saturday")|(day.equals("Sunday")))
        {
            System.out.println("выходной");
        }
            else if ((day.equals("Monday")|(day.equals("Tuesday")|(day.equals("Wednesday")|(day.equals("Thursday")|(day.equals("Friday"))))))){
            System.out.println("будний");
    }
}
}






