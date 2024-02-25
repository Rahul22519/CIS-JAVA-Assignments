package Assignment11;

//Write a Java program to return the sum of the digits present in the given string.
// If there is no digits the sum return is 0

import java.util.Scanner;

public class StringAdd {
    public static void main(String[] args) {
        Scanner stringValue = new Scanner(System.in);
        System.out.println("Enter String value:");
        String str = stringValue.nextLine();
        int add = addOfStringValue(str);
        System.out.println(add);
    }

    public static int addOfStringValue(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                sum += Character.getNumericValue(ch);
            }
        }
        return sum;
    }
}