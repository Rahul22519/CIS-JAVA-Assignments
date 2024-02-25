package Assignment11;

import java.util.Scanner;

//Write a Java program to Count words in Given String
 //   Input : my favourite cricker is yuvraj singh
 //   output : 6
public class StringCountWord {
    public static void main(String[] args) {
        Scanner stringValue = new Scanner(System.in);
        System.out.println("Enter String value:");
        String str = stringValue.nextLine();
        int count = countWords(str);
        System.out.println("Count is:" + count);
    }

    public static int countWords(String s){
        String[] counts = s.split("\\s+");
        return counts.length;
    }
}
