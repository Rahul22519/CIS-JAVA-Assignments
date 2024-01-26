package Assignment7;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        System.out.println("Enter any number to check Whether it is prime or not:");
        int number = num.nextInt();
        boolean flag = false;
        for (int i=2; i<= number/2; i++){
            if (number % i == 0) {
                flag = true;
                break;
            }
        }
        if(!flag)
           System.out.println("The Number "+number+ " is a Prime Number");
        else
            System.out.println("The Number "+number+ " is not a Prime Number");
        }
}
