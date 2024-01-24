package Assignment5;

import java.util.Scanner;

public class StringToFloat {
    public static void main(String[] args){
        Scanner stringValue = new Scanner(System.in);
        System.out.println("Enter String value:");
        String str = stringValue.nextLine();
        Float f = Float.parseFloat(str);
        System.out.println("String value Converted to Float value:" +f);
    }
}
