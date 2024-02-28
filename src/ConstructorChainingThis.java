class Person{
    private int age;
    private String name;

    public Person(){
        this(10,"Telusko");
    }

    public  Person(int age, String name){
        this.age=age;
        this.name=name;
    }

    public Person(int age){
        this();
        this.age=age;
        System.out.println(age);
        System.out.println(name);
    }
}



public class ConstructorChainingThis {
    public static void main(String[] args) {
        Person p=new Person(10);

    }
}
