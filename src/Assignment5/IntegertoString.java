package Assignment5;

import java.util.Scanner;

public class IntegertoString {
    public static void main(String[] args) {
        Scanner intValue = new Scanner(System.in);
        System.out.println("Enter Integer value:");
        int a = intValue.nextInt();
        String s = Integer.toString(a);
        System.out.println("Integer value converted to string...");
        System.out.println("The String Value is:" + s);

        //String b = intValue.nextLine();
        int i = Integer.parseInt(s);
        System.out.println("String value converted to Integer...");
        System.out.println("The Integer Value is:" +i);

    }
}
