package Batch5_JavaLearning.Day19;

class parent
{
    String name="sivakumar";

    void m1()
    {
        System.out.println("This is parent class");
    }
}

class child extends parent
{
    int sid=101;
    void m2()
    {
        System.out.println("This is child class methods");
    }
}

public class object   {
    public static void main(String[] args) {

        child c=new child();
        System.out.println(c.name);//possible
        //possible
        System.out.println(c.sid);//possible
        c.m2();//possible

        parent p=new child();//upcasting

        System.out.println(p.name);
        p.m1();

        parent p1=new parent();
        child c1=(child) p1;//Downcasting


    }


}
