public class Employee extends Person{
    private String employeeId;


    public Employee(String name, int age, String employeeId) {
        super(name, age);  // вызов конструктора суперкласса
        this.employeeId = employeeId;
    }


    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }
}


