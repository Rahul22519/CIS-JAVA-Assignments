package Assignment6;

public class Employee {
    String employeeName;
    String employeeJobTitle;
    double employeeSalary;

    public Employee(String name, String jobTitle, double salary){
        this.employeeName = name;
        this.employeeJobTitle = jobTitle;
        this.employeeSalary = salary;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeJobTitle() {
        return employeeJobTitle;
    }

    public void setEmployeeJobTitle(String employeeJobTitle) {
        this.employeeJobTitle = employeeJobTitle;
    }

    public double getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(double employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public void raiseSalary(double percentage){
        double raisedSalary = employeeSalary * (percentage/100);
        employeeSalary = employeeSalary + raisedSalary;
        System.out.println("Employee salary raised by " +percentage+"%. Updated Salary:"+employeeSalary);
    }

    public void employeeInfo(){
        System.out.println("Employee Information:");
        System.out.println("Name: " + employeeName);
        System.out.println("Job Title: " + employeeJobTitle);
        System.out.println("Salary: " + employeeSalary);
    }
    public static void main(String[] args){
        Employee employee = new Employee("Rahul", "Java Developer", 25000);
        employee.employeeInfo();
        employee.raiseSalary(20);
        employee.employeeInfo();
    }
}
