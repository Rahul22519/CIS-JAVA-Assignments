package Assignment6;

public class Person {
    String personName;
    int personAge;

    public Person(String name, int age){
        this.personName = name;
        this.personAge = age;
    }

    public static void main(String[] args){
        Person p1 = new Person("Rahul", 26);
        System.out.println("First Instance details:" +p1.personName+ "," +p1.personAge);
        Person p2 = new Person("Sai", 28);
        System.out.println("Second Instance details:" +p2.personName+ "," +p2.personAge);

    }
}
