import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args){

        // Java program to convert inch to meter
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an Inch number");
        int inch = sc.nextInt();
        double meter;
        meter = inch * 0.0254;
        System.out.println("The value of Inch "+inch+ " in meters is " +meter);

        // Java program to print square,cube,fourthpower of a number
        Scanner sq = new Scanner(System.in);
        System.out.println("Enter any number to calculate square,cube & fourthpower");
        double number = sq.nextDouble();
        double square = number * number;
        double cube = square * number;
        double fourthpower = cube * number;
        System.out.println(" The square for entered number is: " +square);
        System.out.println(" The Cube for entered number is: " +cube);
        System.out.println(" The fourthpower for entered number is: " +fourthpower);

        // Java program to check 4 numbers equal or not
        Scanner num = new Scanner(System.in);
        System.out.println("Input first number:");
        int num1 = num.nextInt();
        System.out.println("Input second number:");
        int num2 = num.nextInt();
        System.out.println("Input third number:");
        int num3 = num.nextInt();
        System.out.println("Input fourth number:");
        int num4 = num.nextInt();

        if( num1 == num2 && num2 == num3 && num3 == num4){
            System.out.println("Numbers are equal");
        }
        else {
            System.out.println("Numbers are not equal");
        }

        // Java program to check even or odd
        Scanner eo = new Scanner(System.in);
        System.out.println("SampleInput to check even or odd:");
        int number5 = eo.nextInt();
        String result = (number5 % 2 == 0) ? "even" : "odd" ;
        System.out.println("It is a "+result + "number");
    }
}
