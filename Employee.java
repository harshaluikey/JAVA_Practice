// USAGE OF GETTER & SETTER IN SAME CLASS (CONSTRUCTOR):

public class Employee {
    private int employee_id;
    private String employee_name;
    private double employee_salary;

    public static void main(String[] args) {
        Employee employee = new Employee(1,"Harshal",50000.00);
        System.out.println("Employee Details Are:\n"+employee.display()+"\n");
        employee.setEmployeeId(2);
        employee.setEmployeeName("ABC");
        employee.setEmployeeSalary(50000.00);
        System.out.println("Employee Details Are:\n"+employee.display());
    }
    public Employee(int id, String name, double salary){
        this.employee_id=id;
        this.employee_name=name;
        this.employee_salary=salary;
    }
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
