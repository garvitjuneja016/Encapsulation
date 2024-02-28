class Alien{
    private int age;
    private String name;

    public void setAge(int x){
        if (x>0)
        {
        age=x;
        }
        else {
            System.out.println("Invalid Age");
        }
    }
    public void setName(String y){
        name=y;
    }
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
}


public class Encap2 {
    public static void main(String[] args) {
       Alien a=new Alien();
//       a.age=10;
//       a.name="Rahul";
//        System.out.println(a.age);
//        System.out.println(a.name);
        a.setAge(0);
        a.setName("Ram");
        System.out.println(a.getAge());
        System.out.println(a.getName());
    }
}
