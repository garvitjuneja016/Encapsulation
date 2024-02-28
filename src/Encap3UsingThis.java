class Fan{
    private int cost;
    private String brand;

    public void setCost(int cost) {
        this.cost = cost;      /*Shadowing Problem:: whenever there is a naming conflict b/w instance varible & local variable
                                                      within a method,this problem we call it as SHADOWING PROBLEM*/
    }                                      /* That is why we use this Keyword*/
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getCost() {
        return cost;
    }

    public String getBrand() {
        return brand;
    }
}



public class Encap3UsingThis {
    public static void main(String[] args) {
       Fan f1=new Fan();
       f1.setCost(100);
       f1.setBrand("Bajaj");
        System.out.println(f1.getCost());
        System.out.println(f1.getBrand());
    }
}
