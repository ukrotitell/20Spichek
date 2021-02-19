import java.util.InputMismatchException;
import java.util.Scanner;

public class LogicControllerGame {
    public static int SpichekLeft = 20;
    public int AmountSpichekComputerTakes() {
        if (SpichekLeft == 20) {
            SpichekLeft -= 3;
            System.out.println("Компьютер взял 3 спички");
            System.out.println("Осталось " + SpichekLeft + " спичек");
        }
        if (SpichekLeft < 17 && SpichekLeft > 13) {
            int computerTookSpichki = SpichekLeft - 13;
            SpichekLeft = 13;
            System.out.println("Компьютер взял " + computerTookSpichki + " спички");
            System.out.println("Осталось " + SpichekLeft + " спичек");
        }
        if (SpichekLeft < 13 && SpichekLeft > 9) {
            int computerTookSpichki = SpichekLeft - 9;
            SpichekLeft = 9;
            System.out.println("Компьютер взял " + computerTookSpichki + " спички");
            System.out.println("Осталось " + SpichekLeft + " спичек");
        }
        if (SpichekLeft < 9 && SpichekLeft > 5) {
            int computerTookSpichki = SpichekLeft - 5;
            SpichekLeft = 5;
            System.out.println("Компьютер взял " + computerTookSpichki + " спички");
            System.out.println("Осталось " + SpichekLeft + " спичек");
        }
        if (SpichekLeft == 4) {
            SpichekLeft -= 3;
            System.out.println("Компьютер взял " + 3 + " спички");
            System.out.println("Осталось " + SpichekLeft + " спичек");
        }
        if (SpichekLeft == 3) {
            SpichekLeft -= 2;
            System.out.println("Компьютер взял " + 2 + " спички");
            System.out.println("Осталось " + SpichekLeft + " спичек");
        }
        if (SpichekLeft == 2) {
            SpichekLeft -= 1;
            System.out.println("Компьютер взял " + 1 + " спички");
            System.out.println("Осталось " + SpichekLeft + " спичек");
        }
        return SpichekLeft;
    }
    public static void main(String[] args) {
        LogicControllerGame logicControllerGame = new LogicControllerGame();
        LogicPlayerGame logicPlayerGame = new LogicPlayerGame();
        int turn = 0;
        while (SpichekLeft != 1) {
            System.out.println("Ход N" + ++turn);
            logicControllerGame.AmountSpichekComputerTakes();
            if (SpichekLeft == 1 && turn % 2 != 0) {
                System.out.println("Компьютер победил");
                break;
            }
            System.out.println("Ход N" + ++turn);
            logicPlayerGame.AmountSpichekIgrokTakes(SpichekLeft);
        }
    }
}
