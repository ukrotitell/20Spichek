import java.util.InputMismatchException;
import java.util.Scanner;

public class LogicPlayerGame {
    public int AmountSpichekIgrokTakes(int spichekLeft) {
        int numbersOfSpichek = 4;
        while (numbersOfSpichek > 3 || numbersOfSpichek < 1) {
            try {
                System.out.println("Сколько спичек взять?");
                numbersOfSpichek = new Scanner(System.in).nextInt();
            } catch (InputMismatchException e) {
                numbersOfSpichek = 4;
                System.out.println("Вы ввели недопустимый символ");
            }
            if (numbersOfSpichek > spichekLeft) {
                numbersOfSpichek = 4;
                System.out.println("Спичек осталось меньше заданного вами числа");
            }
            if (numbersOfSpichek > 3 || numbersOfSpichek < 1) {
                numbersOfSpichek = 4;
                System.out.println("Можно взять 1-3 спичку");
            }
        }
        LogicControllerGame.SpichekLeft = spichekLeft - numbersOfSpichek;
        System.out.println("Осталось " + LogicControllerGame.SpichekLeft + " спичек");
        return numbersOfSpichek;
    }

}
