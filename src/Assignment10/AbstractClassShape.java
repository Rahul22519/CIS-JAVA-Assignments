package Assignment10;

//Write a Java program to create an abstract class Shape with abstract methods calculateArea() and calculatePerimeter().
//Create subclasses Circle and Triangle that extend the Shape class
//and implement the respective methods to calculate the area and perimeter of each shape.


abstract class Shape{
    abstract double calculateArea();
    abstract double calculatePerimeter();
}

class Circle extends Shape{
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
    double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}
class Triangle extends Shape{

    private double s1,s2,s3;

    public Triangle(double s1, double s2, double s3) {
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }
    @Override
    double calculateArea(){
        double s = (s1 + s2 + s3) / 2;
        return Math.sqrt(s * (s - s1) * (s - s2) * (s - s3));
    }
    @Override
    double calculatePerimeter() {
        return s1+s2+s3;
    }
}
public class AbstractClassShape {
    public static void main(String[] args){
        Circle circle = new Circle(20);
        System.out.println("Circle Area:" +circle.calculateArea());
        System.out.println("Circle Perimeter:" +circle.calculatePerimeter());
        Triangle triangle = new Triangle(3,4,5);
        System.out.println("Triangle Area:" +triangle.calculateArea());
        System.out.println("Triangle Perimeter:" +triangle.calculatePerimeter());
    }
}
