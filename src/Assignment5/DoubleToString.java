package Assignment5;

import java.util.Scanner;

public class DoubleToString {
    public static void main(String[] args){
        Scanner doubleValue = new Scanner(System.in);
        System.out.println("Enter Double value:");
        double d = doubleValue.nextDouble();
        String s = Double.toString(d);
        System.out.println("Double value converted to string...");
        System.out.println("The String Value is:" + s);
    }
}
