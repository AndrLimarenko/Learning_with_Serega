package Task_1;

public class Lesson_1 {
    public static void main(String[] args) {
        String s = "Winter";
        checkSeason(s);
        s = "summer";
        checkSeason(s);
        s = "winter";
        checkSeason(s);
    }
        public static void checkSeason(String season){
        if ((season.equals("Winter")|(season.equals("winter")))){
                System.out.println("It's cold");
            }
    }
}
