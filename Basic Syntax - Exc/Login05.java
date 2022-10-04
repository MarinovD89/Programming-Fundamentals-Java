package BasicSyntaxExc;

import java.util.Scanner;

public class Login05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String userName = scanner.nextLine();
        String password = "";

        for (int position = userName.length() - 1; position >= 0; position--) {  // Първо запояваме от последната към нулевата позиция
            char currentSymbol = userName.charAt(position);
            password += currentSymbol;

        }
        String enteredPass = scanner.nextLine();
        int countTry = 0;
           while (!enteredPass.equals(password)){
               countTry++;
               if (countTry == 4){
                   System.out.printf("User %s blocked!" , userName);
                    break;
               }
               System.out.println("Incorrect password. Try again.");
               enteredPass = scanner.nextLine();

           }
            if (enteredPass.equals(password)){
                System.out.printf("User %s logged in." , userName );

            }
    }
}
