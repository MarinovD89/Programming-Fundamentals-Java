package DataTypesAndVarExc;

import java.util.Scanner;

public class IntegerOperations01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Входни данни
        //Събиране 1 и 2 / трето * четвърто
        //отпечатвеме
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber= Integer.parseInt(scanner.nextLine());
        int thirdNumber = Integer.parseInt(scanner.nextLine());
        int fourthNumber= Integer.parseInt(scanner.nextLine());

        int result= ((firstNumber + secondNumber) / thirdNumber) * fourthNumber;

        System.out.println(result);

    }
}
