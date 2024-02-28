class Student
{
//    Instance vars.
    private int age;
    private  String name;

//    Constructor
    public Student(int age,String name){
        this.age=age;
        this.name=name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
public class Encap4UsingConst {
    public static void main(String[] args) {
        Student std=new Student(10,"RAMESH");     /* Constucter invoked during the object creation*/
        System.out.println(std.getAge());
        System.out.println(std.getName());

    }
}
