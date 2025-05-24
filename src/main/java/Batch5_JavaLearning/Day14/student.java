package Batch5_JavaLearning.Day14;

public interface student {

    int a=10;//final & static
    void add();//abstarct

    default void display()
    {

    }
    static void diaplay()
    {
        System.out.println(a);
    }
}
