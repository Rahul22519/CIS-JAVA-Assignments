package Assignment7;

public class SumOfEvenOdd {

    public static void main(String[] args) {
        int count = 0, counts = 0, evenNum = 2, oddNum = 1;
        int sumOfEven = 0;
        int sumOfOdd = 0;
        while (count < 10) {
            if (evenNum % 2 == 0) {
                sumOfEven += evenNum;
                evenNum += 2;
            }
            count++;
        }

        while (counts < 10) {
            if (oddNum % 2 != 0) {
                sumOfOdd += oddNum;
                oddNum += 2;
            }
            counts++;
        }
        System.out.println("Sum of first 10 Even numbers is:" + sumOfEven);
        System.out.println("Sum of first 10 Odd numbers is:" + sumOfOdd);
    }
}
