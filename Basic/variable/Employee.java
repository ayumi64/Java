public class Employee {

    public String name; //

    private double salary; //私有变量，仅在该类可见

    public Employee(String empName){  

        name = empName;  //通过构造器赋值

    }

    public void setSalary(double empSal){
        salary = empSal; //构造器设定salary的值

    }
        public void printEmp(){
            System.out.println("名字："+ name);
            System.out.println("薪水"+ salary);
        }

    public static void main(String[] args){
        Employee empOne = new Employee("sonic");
        empOne.setSalary(1000);
        empOne.printEmp();
    }
}