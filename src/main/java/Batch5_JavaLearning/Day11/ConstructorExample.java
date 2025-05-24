package Batch5_JavaLearning.Day11;

public class ConstructorExample {

    ConstructorExample()
    {
        System.out.println("Default constructor");
    }
    ConstructorExample(int a,int b)
    {
        System.out.println(a+b);
    }
    ConstructorExample(String a,String b)
    {
        System.out.println(a+b);
    }

    public static void main(String[] args) {

        ConstructorExample c=new ConstructorExample();
        ConstructorExample c1=new ConstructorExample(10,20);
        ConstructorExample c2=new ConstructorExample("mani","IT");


    }
}
