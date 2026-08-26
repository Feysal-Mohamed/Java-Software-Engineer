package Encapsulation;
class Presons{
    private String name ;
    private  int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
       if(age>0){
           this.age = age;
       }else {
           System.out.println(age +" age must greater than 0");
       }
    }
}
public class person {

}
