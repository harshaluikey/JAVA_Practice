// PROGRAM FOR ENCAPSULATION:
//uncomment the commented to use Constructor & Comment out lines 6-14.
import java.util.*;
public class EmployeeMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee1 employee = new Employee1();
        System.out.println("Enter Employee ID: ");
        employee.setEmployeeId(scanner.nextInt());
        System.out.println("Enter Employee NAME: ");
        employee.setEmployeeName(scanner.next());
        System.out.println("Enter Employee SALARY: ");
        employee.setEmployeeSalary(scanner.nextDouble());
        System.out.println("DETAILS OF THE EMPLOYEE ARE\nEmployee id: "+employee.getEmployeeId()+"\nEmployee name: "+employee.getEmployeeName()+"\nEmployee salary: "+employee.getEmployeeSalary());

//        Employee employee = new Employee(1,"Harshal",50000.00);
//        System.out.println("Employee Details Are:\n"+employee.display()+"\n");
//        employee.setEmployeeId(2);
//        employee.setEmployeeName("ABC");
//        employee.setEmployeeSalary(60000.00);
//        System.out.println("After Updating, Employee Details Are:\n"+employee.display());
    }
}

class Employee1{
    private int employee_id;
    private String employee_name;
    private double employee_salary;

    // USING CONSTRUCTOR:
//        public Employee1(int id, String name, double salary){
//        this.employee_id=id;
//        this.employee_name=name;
//        this.employee_salary=salary;
//    }
    public int getEmployeeId() {
        return employee_id;
    }
    public void setEmployeeId(int id) {
        this.employee_id = id;
    }
    public String getEmployeeName() {
        return employee_name;
    }
    public void setEmployeeName(String name) {
        this.employee_name = name;
    }
    public double getEmployeeSalary() {
        return employee_salary;
    }
    public void setEmployeeSalary(double salary) {
        this.employee_salary = salary;
    }
    public String display(){
        return "Emp id: "+employee_id+"\nEmp Name: "+employee_name+"\nEmp Salary: "+employee_salary;
    }
}