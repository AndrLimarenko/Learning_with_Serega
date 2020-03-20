package Task_1;

public class Lesson_2 {
    public static void main(String[] args) {
        int p = 1000;
        checkPrise(p);
        p = 999;
        checkPrise(p);
    }

    public static void checkPrise (int prise){
        if (prise>=1000){
            System.out.println("цена завышена");
        }
        else
            System.out.println("цена нормальная");
    }
}
