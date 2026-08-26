package Inheritance;

class EmployeFields{
    private int id;
    private String name="unknown";
    private double  salary ;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if(salary>0){
            this.salary = salary;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if(id>0){
            this.id = id;
        }
    }

    void  displayInfo(){
        System.out.println("name : "+getName());
        System.out.println("salary : $"+getSalary());
    }
}

class Manager extends EmployeFields{
   int teamSize;
   String department;

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("teamSize is : "+teamSize);
        System.out.println("department manage is : "+department);
    }
}


public class Employee {
}

