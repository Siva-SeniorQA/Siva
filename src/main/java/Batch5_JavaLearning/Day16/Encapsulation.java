package Batch5_JavaLearning.Day16;

public class Encapsulation {

    private String accno;
     private String name;

    void setAccno(String accno) {
        this.accno = accno;
    }
    void getAccno()
    {
        System.out.println(this.accno);
    }

    public void setName(String name) {
        this.name = name;
    }
    void getName()
    {
        System.out.println(this.name);
    }

    public static void main(String[] args) {

        Encapsulation e=new Encapsulation();
        e.setAccno("AD10000");
        e.getAccno();
        e.setName("Sivakumar");
        e.getName();

    }
}
