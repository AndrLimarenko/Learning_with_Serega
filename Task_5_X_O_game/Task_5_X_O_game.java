
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task_5_X_O_game {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String strDate = reader.readLine();
        if (!checkIncorrectStringFormat(strDate)) {
            System.out.println("1. Неправильный ввод");
        }

        int[] fields = new int[9];
        int total = 0;
        int zerosAmount = 0;
        boolean vinFlag = false;
        for (int i = 0; i < fields.length; i++) {
            fields[i] = getInt(strDate.charAt(i));
            if (fields[i] == 0) {
                zerosAmount++;
            }
            total = total + fields[i];
            System.out.print(fields[i] + " ");
            if (i == 2 || i == 5)
                System.out.println();
        }
        System.out.println();
        System.out.println("Total is: " + total);
        System.out.println("zeroAmoumt is: " + zerosAmount);
        if (total < -1 || total > 1) {
            System.out.println("2. Правильный ввод, некорректный статус");
        }
        int winRow1 = fields[0] + fields[1] + fields[3];
        int winRow2 = fields[3] + fields[4] + fields[5];
        int winRow3 = fields[6] + fields[7] + fields[8];
        int winColumn1 = fields[0] + fields[3] + fields[6];
        int winColumn2 = fields[1] + fields[4] + fields[7];
        int winColumn3 = fields[3] + fields[5] + fields[8];
        int winDiagonal1 = fields[0] + fields[4] + fields[8];
        int winDiagonal2 = fields[6] + fields[4] + fields[3];
        if (winRow1 == 3 || winRow2 == 3 || winRow3 == 3 || winColumn1 == 3 || winColumn2 == 3 || winColumn3 == 3 || winDiagonal1 == 3 || winDiagonal2 == 3) {
            vinFlag = true;
            System.out.println("4. Корректный статус, игра закончена, “крестики” выиграли");
        } else if (winRow1 == -3 || winRow2 == -3 || winRow3 == -3 || winColumn1 == -3 || winColumn2 == -3 || winColumn3 == -3 || winDiagonal1 == -3 || winDiagonal2 == -3) {
            System.out.println("5. Корректный статус, игра закончена, “нолики” выиграли");
            vinFlag = true;
            System.out.println(vinFlag);
        } else if (zerosAmount == 0) {
            System.out.println("3. Корректный статус, игра закончена - ничья");
        }
        if ((zerosAmount > 0) & (!vinFlag)) {
            if ((total == 0) || (total == -1)) {
                System.out.println("6. Корректный статус, игра продолжается, крестики ходят");
            } else {
                System.out.println("7. Корректный статус, игра продолжается, нолики ходят");
            }
        }
    }

    static int getInt(char symbol) {
        if ((symbol == 'X') || (symbol == 'x')) {
            return 1;
        } else if ((symbol == 'O') || (symbol == 'o')) {
            return -1;
        } else
            return 0;
    }

    public static boolean checkIncorrectStringFormat(String testString) {
        Pattern p = Pattern.compile("^[x,o,X,O,-]{9}$");
        Matcher m = p.matcher(testString);
        return m.matches();
    }
}

