package BasicSyntaxExc;

import java.util.Scanner;

public class RageExpenses11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int lostGames = Integer.parseInt(scanner.nextLine());
        double headSetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        int countHeadSet = lostGames / 2;
        int countMouseSet = lostGames / 3;
        int countKeyboards = lostGames /  6;
        int countDisplay = lostGames / 12;

        double finalSum =(countHeadSet * headSetPrice) + (countMouseSet * mousePrice) + (countKeyboards * keyboardPrice) + (countDisplay * displayPrice);
        System.out.printf("Rage expenses: %.2f lv." , finalSum);
    }
}
