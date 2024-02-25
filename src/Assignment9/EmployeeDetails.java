package Assignment9;

public class EmployeeDetails {
    public static void main(String[] args){
        HRManager hrManager = new HRManager();
        hrManager.work();
        System.out.println("Employee Salary: "+ hrManager.getSalary());
        hrManager.addEmployee();
    }
}

class Employee{
    void work(){
        System.out.println("Employee is Working");
    }

    double getSalary(){
        return 75000.00;
    }
}

class HRManager extends Employee{
    @Override
    void work() {
        System.out.println("HRManager is managing Employees");
    }

    void addEmployee(){
        System.out.println("HR Manager is adding a new Employee");
    }
}

// Write a Java program to create a class called Employee with methods called work() and getSalary().
// Create a subclass called HRManager that overrides the work() method and adds a new method called addEmployee().