package Batch5_JavaLearning.Day13;

class A
{
    int a=10;
    int b=20;
    void add()
    {
        System.out.println(a);
    }
}

class B extends A
{

    void sub()
    {
        System.out.println(b-a);
    }
}

public class inheritence extends A{

    void sum()
    {
        System.out.println(a);
    }


    public static void main(String[] args) {

        B b=new B();
        b.sub();
        b.add();

        inheritence i=new inheritence();
        i.sum();
        i.add();
    }
}
