package Assignment10;

//Write a Java program to create an abstract class Animal with abstract methods eat() and sleep().
//Create subclasses Lion, Tiger, and Deer that extend the Animal class and
//implement the eat() and sleep() methods differently based on their specific behavior

abstract class Animal{
    abstract void eat();
    abstract void sleep();
}

class Lion extends Animal{
    @Override
    void eat() {
        System.out.println("Lion is Eating");
    }

    @Override
    void sleep() {
        System.out.println("Lion is Sleeping");
    }
}

class Tiger extends Animal{
    @Override
    void eat() {
        System.out.println("Tiger is Eating");
    }

    @Override
    void sleep() {
        System.out.println("Tiger is Sleeping");
    }
}

class Deer extends Animal{
    @Override
    void eat() {
        System.out.println("Deer is Eating");
    }

    @Override
    void sleep() {
        System.out.println("Deer is Sleeping");
    }
}
public class AbstractClassAnimal {
    public static void main(String[] args){
        Lion lion = new Lion();
        lion.eat();
        lion.sleep();

        Tiger tiger = new Tiger();
        tiger.eat();
        tiger.sleep();

        Deer deer = new Deer();
        deer.eat();
        deer.sleep();
    }
}
