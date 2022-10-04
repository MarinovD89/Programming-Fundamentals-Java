package DataTypesAndVarExc;

import java.util.Scanner;

public class SumDigits02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //1. входни данни
        //stop : числото ,= 0
        //продължавам : числото > 0
        //повтаряме
        //2. сбора на числата
        //--> % 10
        //сумираме цифрата
        //махаме последната цифра --> / 10 ( 65436,3)
        int number = Integer.parseInt(scanner.nextLine());
        int sum = 0; // сумата от цифрите
        while (number > 0){
            int lastDigit = number % 10;
            sum+=lastDigit;
            number = number / 10;

        }
        System.out.println(sum);

        //Решение с for-цикъл
        // for ( int number = Integer.parseInt(scanner.nextLine()); number > 0 ; number = number / 10{
        //int lastDigit = number % 10;
        //sum += lastDigit;
    }
}
