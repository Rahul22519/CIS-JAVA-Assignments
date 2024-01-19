public class Assignment4 {
    public static void main(String[] args){
        Animal animal = new Animal();
        System.out.println("The Animal information is:");
        animal.Animalname = "Cat";
        animal.Height = 2.3;
        animal.Weight = 20;
        animal.Sound = "Meow Meow";
        animal.displayAnimalInfo();

        Employees emp = new Employees();
        System.out.println("The Employee information is:");
        emp.empid = 1;
        emp.ename = "Rahul";
        emp.role = "Java Developer";
        emp.salary = 50000;
        emp.displayEmployeeInfo();

        Car car = new Car();
        System.out.println("The Car information is:");
        car.Carmake = "Toyoto";
        car.Carmodel = "Camry";
        car.Cartype = "Sedan";
        car.year = 2020;
        car.displayCarInfo();

        Person person = new Person();
        System.out.println("The Person information is:");
        person.Personid = 10;
        person.Pname = "Rahul";
        person.Prole = "Employee";
        person.Psalary = 75000;
        person.displayPersonInfo();

    }
}

    class Animal {
    //Example prog for class
    double Weight;
    String Animalname;
    String Sound;
    double Height;

    void displayAnimalInfo() {
        System.out.println("Animal Name is:"+Animalname);
        System.out.println("Animal Height is:"+Height);
        System.out.println("Animal Weight is:"+Weight);
        System.out.println("Animal does Sound:"+Sound);
    }
}
     class Employees {
    //Example prog for class
    int empid;
    String ename;
    String role;
    float salary;

    void displayEmployeeInfo() {
        System.out.println("Employee id is:"+empid);
        System.out.println("Employee Name is:"+ename);
        System.out.println("Employee Role is:"+role);
        System.out.println("Employee Salary is:"+salary);
    }
}

     class Car {
    //Example prog for class
    String Carmake;
    String Cartype;
    String Carmodel;
    int year;

    void displayCarInfo() {
        System.out.println("Car Make is:"+Carmake);
        System.out.println("Car Model is:"+Carmodel);
        System.out.println("Car Type is:"+Cartype);
        System.out.println("Car Year is:"+year);
    }
}

     class Person {
    //Example prog for class
    int Personid;
    String Pname;
    String Prole;
    float Psalary;

    void displayPersonInfo() {
        System.out.println("Person Id is:"+Personid);
        System.out.println("Person Name is:"+Pname);
        System.out.println("Person Role is:"+Prole);
        System.out.println("Person Salary is:"+Psalary);
    }
}