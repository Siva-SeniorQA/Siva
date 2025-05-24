package Batch5_JavaLearning.Day15;

public class interfaceExample implements interface2 ,interface3,interface4,interface5{

    public void display()
    {
        System.out.println("this is interface1 Abstarct method");
    }
   public void print()
    {
        System.out.println("this is interface2 Abstarct method");
    }
    public static void main(String[] args) {
    interfaceExample in=new interfaceExample();
    in.add();
    in.show();
    interface1.sub();
    in.display();
    in.print();
    in.display3();
    in.display4();
    in.display5();

    }
}
