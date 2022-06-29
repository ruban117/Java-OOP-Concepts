import java.util.*;
class Employee{
    int id;
    int salary;
    String name;
    public void printDetails(){
        System.out.println("My id is " + id);
        System.out.println("and my name is "+ name);
    }

    public int getSalary(){
        return salary;
    }
}
class custom_class{
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        Employee ruban = new Employee(); // Instantiating a new Employee Object
        Employee john = new Employee(); // Instantiating a new Employee Object

        // Setting Attributes for Ruban
        ruban.id = 12;
        ruban.salary = 34;
        ruban.name = "Ruban Pathak";

        // Setting Attributes for John
        john.id = 17;
        john.salary = 12;
        john.name = "John Das";

        // Printing the Attributes
        ruban.printDetails();
        john.printDetails();
        int salary = john.getSalary();
        System.out.println(salary);
    }
}
