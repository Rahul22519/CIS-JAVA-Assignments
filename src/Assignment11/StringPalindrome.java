package Assignment11;

import java.util.Scanner;

//Write a Java program How to check Palindrome String
//    Inupt : java
//        output : not palindrome
//        input : amma
//        output : palindrome
public class StringPalindrome {
    public static void main(String[] args){
        Scanner stringValue = new Scanner(System.in);
        System.out.println("Enter String value:");
        String str = stringValue.nextLine();
        System.out.println("Output: " + (isPalindrome(str) ? "palindrome" : "not palindrome"));
    }

    public static boolean isPalindrome(String s){
        s = s.toLowerCase();
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
