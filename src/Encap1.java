class book{
    private int pgNo;

    public void setPgNo(int x) {
        if (x > 0) {
            pgNo = x;
        } else {
            System.out.println("Invalid Input");
        }
    }
    public int getPgNo() {
        return pgNo;
    }
}


public class Encap1 {
    public static void main(String[] args) {
        book b=new book();
//        b.pgNo=100;
//        System.out.println(b.pgNo);
        b.setPgNo(-100);
        System.out.println(b.getPgNo());
    }
}
