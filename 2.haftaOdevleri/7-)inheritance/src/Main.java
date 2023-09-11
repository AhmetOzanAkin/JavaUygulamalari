public class Main {
    public static void main(String[] args) {
    Customer customer = new Customer();
    Employee employee = new Employee();

    EmployeeManager employeeManager = new EmployeeManager();
    CustomerManager customerManager = new CustomerManager();
    employeeManager.BestEmployee();
    //customerManager.Add();
    //customerManager.List(); customer managerde sadece add ve list var employeemanager de ekstra olarak best employee var
    }
}