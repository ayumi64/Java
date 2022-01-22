import java.io.*;

public class EmployeeTest{

    public static void main(String[] args){

    //new两个类
    Employee empA = new Employee("Reimi");
    Employee empB = new Employee("MuQ");

    empA.empAge(28);
    empA.empDesignation("Programer");
    empA.empSalary(10000);
    empA.printEmployee();

    empB.empAge(26);
    empB.empDesignation("Tester");
    empB.empSalary(10000);
    empB.printEmployee();

    }

}