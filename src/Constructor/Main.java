package Constructor;

public class Main {
    public static void main(String[] args){
        Person person1 = new Person("John Doe", 25);
        Person person2 = new Person("Jane Smith", 30);

        // Printing details of the created persons
        System.out.println("Person 1 Details:");
        person1.printDetails();

        System.out.println("Person 2 Details:");
        person2.printDetails();
    }
}
