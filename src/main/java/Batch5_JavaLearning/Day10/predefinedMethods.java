package Batch5_JavaLearning.Day10;

public class predefinedMethods {

    int c;


    //no returntype & without arguments
    void add()
    {
        c=200+400;
        System.out.println(100+200);
    }
    //no returntype & with arguments

    void sub(int a)
    {
        a=a-a;
        System.out.println(a);
    }

    void mul(int a,int b,int c)
    {
       // c=60;
        c=a+b;
        System.out.println(c);//30
    }
    //with returntype & without arguments
    int add1()
    {
        int a=100;
        int b=200;
        c=a+b;//300
        return c;
    }

    //with returntype & with arguments

    int add2(int x,int y)
    {
        x=1;
        y=2;
        int z=x+y;
        return z;
    }


    public static void main(String[] args) {


       predefinedMethods p=new predefinedMethods();

       p.add();
       p.sub(10);
       p.mul(10,20,60);
       System.out.println(p.add1());
        System.out.println(p.add2(1000,2000));


    }
}
