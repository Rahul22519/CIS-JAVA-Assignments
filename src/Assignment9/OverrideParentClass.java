package Assignment9;

class Vehicle {
    public void drive() {
        System.out.println("Repairing a Vehicle");
    }
}

class Car extends Vehicle {
    public void drive() {
        System.out.println("Repairing a Car");
    }
}

public class OverrideParentClass {
    public static void main(String[] args) {
        Car car = new Car();
        car.drive();
    }
}