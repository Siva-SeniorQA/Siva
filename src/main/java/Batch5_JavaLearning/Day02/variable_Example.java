package Batch5_JavaLearning.Day02;
import Batch5_JavaLearning.Day10.employee;
public class variable_Example {

    int x=100;
    int y=200;
    int z;
    void add()
    {
        int z=x+y;
        System.out.println(z);
    }
    void sub()
    {
        z=x+y;
    }
    public static void main(String arg[])
    {

        employee e=new employee();
        e.display4();

        variable_Example v=new variable_Example();
        v.add();

        //Adding two numbers
//byte
        byte a=127;
        byte b=20;

        System.out.println("Byte value:"+ (a+b));

        //short

        short a1=300;
        short b1=500;

        System.out.println("Short value:"+ (a1+b1));

        //int
        int a2=32768;
        int b2=32769;

        System.out.println("Int value:"+ (a2+b2));

        //
        long a3=2768333333333333333L;
        long b3=32769;

        System.out.println("Long value:"+ (a3+b3));


        //10.40 & 20.78899

        //Double
        double dec=10.4088888888888888888888888888d;
        System.out.println(dec);

        //float

        float f=10.777777f;
        System.out.println(f);

        //character

        char sgrade=566;

        System.out.println(sgrade);

        //boolean
        boolean result=true;
        boolean result1=false;
        boolean result3=true;
    }

}
