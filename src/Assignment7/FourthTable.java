package Assignment7;

import java.util.Scanner;

public class FourthTable {
    public static void main(String[] args){
        int num2;
        Scanner number = new Scanner(System.in);
        System.out.println("Enter an table number:");
        int num = number.nextInt();
        System.out.println("The "+num+" table is:");
        for(int i=1; i<=10; i++){
            num2 = num * i;
            System.out.println(+num+"*"+i+"="+num2);
        }
    }
}
