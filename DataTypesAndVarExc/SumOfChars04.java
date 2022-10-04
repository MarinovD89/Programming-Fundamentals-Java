package DataTypesAndVarExc;

import java.util.Scanner;

public class SumOfChars04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //входни данни - брой символи
        //за всеки един символ взимаме стойността -> аски кода на символа -> сумирам
        //повтаря се
        //отпечатваме
        int sum = 0; //сума от аски кодовете
        int countSymbols= Integer.parseInt(scanner.nextLine());
        for (int symbol = 1; symbol <= countSymbols ; symbol++) {
            char value = scanner.nextLine().charAt(0);
            int code=(int) value;
            sum+=code;

        }
        System.out.printf("The sum equals: %d" , sum);


    }
}
