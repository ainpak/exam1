public class Main {
    public static void main(String[] args) {

        Person person1 = new Person();
        System.out.println("Person1: Name = " + person1.getName() + ", Age = " + person1.getAge());


        Person person2 = new Person("Alice", 30);
        System.out.println("Person2: Name = " + person2.getName() + ", Age = " + person2.getAge());


        Employee employee = new Employee("Bob", 40, "E12345");
        System.out.println("Employee: Name = " + employee.getName() + ", Age = " + employee.getAge() + ", Employee ID = " + employee.getEmployeeId());


        Company.printCompanyName();


        Company.changeCompanyName("Tech Innovators Ltd.");
        Company.printCompanyName();
    }
}