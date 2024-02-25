package Assignment10;

//Write a Java program to create an abstract class Person with abstract methods eat() and exercise().
//Create subclasses Athlete and LazyPerson that extend the Person class
//implement the respective methods to describe how each person eats and exercises.

abstract class Person{
    abstract void eat();
    abstract void exercise();
}
class Athlete extends Person{
    @Override
    void eat() {
        System.out.println("Athlete eats diet food");
    }

    @Override
    void exercise() {
        System.out.println("Athlete exercises 4-5 hrs a day");
    }
}

class LazyPerson extends Person{
    @Override
    void eat() {
        System.out.println("LazyPerson eats undiet food");
    }

    @Override
    void exercise() {
        System.out.println("LazyPerson won't exercise at all");
    }
}
public class AbstractClassPerson {
    public static void main(String[] args){
        Athlete athlete = new Athlete();
        athlete.eat();
        athlete.exercise();

        LazyPerson lazyPerson = new LazyPerson();
        lazyPerson.eat();
        lazyPerson.exercise();
    }
}
