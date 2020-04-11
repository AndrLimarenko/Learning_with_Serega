package Task_3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Lesson_5 {
    public static void main(String[] args) throws InterruptedException, ParseException {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        Date firstDate = format.parse("2020-04-11T20:16:46");
        Date secondDate = format.parse("2020-04-11T20:18:59");
        System.out.println(getTimeInSec(firstDate, secondDate));
    }

    public static long getTimeInSec(Date date1, Date date2) {
        long seconds;
        seconds = (date2.getTime() - date1.getTime()) / 1000;
        return seconds;
    }
}
