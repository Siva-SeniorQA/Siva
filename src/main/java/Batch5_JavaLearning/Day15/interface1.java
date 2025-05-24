package Batch5_JavaLearning.Day15;

public interface interface1{

    int a=10;
    int b=20;

    void display();

    default void add()
    {
        System.out.println(a+b);
        sub();
    }

    static void sub()
    {
        System.out.println(b-a);
    }
}
