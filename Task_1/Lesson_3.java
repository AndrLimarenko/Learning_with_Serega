package Task_1;

public class Lesson_3 {
    public static void main(String[] args) {
        checkfinger (3);
        checkfinger (4);
        checkfinger (5);
        checkfinger (1);
        checkfinger (2);
    }

    public static void checkfinger(int num) {
        switch (num) {
            case 1:
                System.out.println("большой");
                break;
            case 2:
                System.out.println("указательный");
                break;
            case 3:
                System.out.println("средний");
                break;
            case 4:
                System.out.println("безымянный");
                break;
            case 5:
                System.out.println("мизинец");
                break;
        }
    }
}
