package Assignment7;

import java.util.Scanner;

public class Factorial {

    static int fact(int factorialNumber) {
        if (factorialNumber == 0)
            return 1;

        return factorialNumber * fact(factorialNumber - 1);
    }

    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Enter any number for factorial:");
        int factNum = number.nextInt();
        System.out.println("The Factorial of "+factNum+ " is : "+fact(factNum));
    }
}
