public class Assignment2 {

    public static void main(String[] args) {

        //Write a program to check if the two numbers 23 and 45 are equal.

        int a = 23;
        int b = 45;

        if (a == b) {
            System.out.println("Both are equal");
        } else {
            System.out.println("Not Equal");
            System.out.println("");

        }
        // Assign values of variables 'a' and 'b' as 55 and 70 respectively and then check if
        // both the conditions 'a < 50' and 'a < b' are true.
        int X = 55;
        int Y = 70;

        if (X < 50 && X < Y) {
            System.out.println("Both conditions 'a < 50' and 'a < b' are true.");
        } else {
            System.out.println("At least one of the conditions is false.");
        }
        System.out.println("");

        // If the marks of Robert in three subjects are 78,45 and 62 respectively (each out of 100 ),
        // write a program to calculate his total marks and percentage marks.
        int marks_subject1 = 90;
        int marks_subject2 = 7;
        int marks_subject3 = 62;

        int totalMarks = marks_subject1 + marks_subject2 + marks_subject3;
        double percentage = ((double) totalMarks / 300) * 100;

        System.out.println("Robert's total marks are " + totalMarks + " and his percentage is " + percentage + "%.");
    }
}

