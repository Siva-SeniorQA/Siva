package Batch5_JavaLearning.Day11;

public class polymorphism {

    int a,b,c;

    void add()
    {
        a=10;
        b=20;
        c=a+b;
        System.out.println(c);
    }

    void add( int a,int b)
    {
        System.out.println(c=a+b);
    }

    void add(int a,int b,int c)
    {
        a=100;
        b=200;
        c=a+b;
        System.out.println(c);
    }

    public static void main(String[] args) {
        polymorphism p=new polymorphism();
        p.add();
        p.add(1000,3000);
        p.add(1,2,3);
    }

}
