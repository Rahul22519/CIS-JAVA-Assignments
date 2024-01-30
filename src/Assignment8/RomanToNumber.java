package Assignment8;
import java.util.Scanner;
public class RomanToNumber {
    public static void main(String[] args) {
        RomanToNumber rtn = new RomanToNumber();
        Scanner romanNum = new Scanner(System.in);
        System.out.println("Enter an Roman Number:");
        String romanNumber = romanNum.nextLine().toUpperCase();
        if (isValid(romanNumber)) {
            System.out.println("Integer for Roman Number is:" + rtn.romanToInt(romanNumber));
        } else {
            System.out.println("Invalid Input");
        }
    }

    private static boolean isValid(String input) {
        for (char c : input.toCharArray()) {
            if (!isValidRomanCharacter(c)) {
                return false;
            }
        }
        return true;
    }

    private static boolean isValidRomanCharacter(char c) {
        return c == 'I' || c == 'V' || c == 'X' || c == 'L' || c == 'C' || c == 'D' || c == 'M';
    }


    double value(char r) {
        if (r == 'I')
            return 1;
        if (r == 'V')
            return 5;
        if (r == 'X')
            return 10;
        if (r == 'L')
            return 50;
        if (r == 'C')
            return 100;
        if (r == 'D')
            return 500;
        if (r == 'M')
            return 1000;
        return -1;
    }

    double romanToInt(String str) {
        double sum = 0;
        for (int i = 0; i < str.length(); i++) {
            double s1 = value(str.charAt(i));
            if (i + 1 < str.length()) {
                double s2 = value(str.charAt(i + 1));
                if (s1 >= s2) {
                    sum = sum + s1;
                } else {
                    sum = sum + s2- s1;
                    i++;
                }
            } else {
                sum = sum + s1;
            }
        }
        return sum;
    }
}
