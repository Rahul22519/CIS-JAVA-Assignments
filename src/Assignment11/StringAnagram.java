package Assignment11;

import java.util.Arrays;
import java.util.Scanner;

//4. Write a program to Check given strings are Anagram or not
//   Ex1:
//    Enter the String 1 : joes
//        Enter the String 2 : oejs
//        Output : Anagram strings
//   Ex2:
//        Enter the String 1 : Care
//        Enter the String 2 : Race
//        Output : Anagram strings
//    Hint : Two strings are said to be anagram if we can form one string by arranging the characters of another string.
//        For example, Race and Care. Here, we can form Race by arranging the characters of Care.
public class StringAnagram {
    public static void main(String[] args) {
        Scanner stringValue = new Scanner(System.in);
        System.out.println("Enter String1 value:");
        String str1 = stringValue.nextLine().toLowerCase();

        System.out.println("Enter String2 value:");
        String str2 = stringValue.nextLine().toLowerCase();

        boolean isAnagram = checkAnagram(str1, str2);
        if (isAnagram) {
            System.out.println("Anagram Strings");
        } else {
            System.out.println("Not Anagram Strings");
        }
        stringValue.close();
    }

    public static boolean checkAnagram(String s1, String s2){
        char[] charArray1 = s1.replaceAll("\\s"," ").toCharArray();
        char[] charArray2 = s2.replaceAll("\\s", " ").toCharArray();

        if(charArray1.length != charArray2.length){
            return false;
        }
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        return Arrays.equals(charArray1,charArray2);
    }
}
