package DataTypesAndVarExc;

import java.util.Scanner;

public class TriplesOfLatinLetters06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (char i = 'a';i < 'a' + n; i++) {
            for (int k = 'a'; k < 'a' + n ; k++) {
                for (int l = 'a'; l < 'a' + n; l++) {
                    System.out.printf("%c%c%c%n" , i , k , l);
                }

            }
        }
    }
}
