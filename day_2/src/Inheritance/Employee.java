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
        System.out.println("Id : "+getId());
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
class Developer extends  EmployeFields{
   String programmingLanguage;
   int  experienceYears;

    void displayInfo() {
        super.displayInfo();
        System.out.println("Programing language is : "+programmingLanguage);
        System.out.println("Experience year is : "+experienceYears +" years");
    }
}

class BackendDeveloper extends Developer{
   String framework;
   String database;

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("framework is : "+framework);
        System.out.println("database is : "+database);
    }
}

public class Employee {
    public static void main(String[] args) {
        BackendDeveloper d1= new BackendDeveloper();
        d1.setName("maxamed");
        d1.setId(1);
        d1.setSalary(899);
        d1.programmingLanguage="java";
        d1.experienceYears=3;
        d1.framework="spring boot";
        d1.database="sql";
        d1.displayInfo();
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
        Manager m1 = new Manager();
        m1.setName("farax");
        m1.setId(1);
        m1.setSalary(900);
        m1.teamSize=8;
        m1.department="HQ";
        m1.displayInfo();
    }
}

