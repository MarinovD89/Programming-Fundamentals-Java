package BasicSyntaxExc;

import java.util.Scanner;

public class PrintAndSum04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int startNumber = Integer.parseInt(scanner.nextLine());
        int endNumber = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int number = startNumber; number <= endNumber ; number++) {
            System.out.print(number + " ");
            sum = sum + number; //sum += number;
        }
        System.out.println(); //Сваляме на нов ред!
        System.out.println("Sum: " + sum);
    }
}