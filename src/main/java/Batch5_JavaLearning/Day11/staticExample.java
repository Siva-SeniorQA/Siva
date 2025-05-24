package Batch5_JavaLearning.Day11;

public class staticExample {


    void display()
    {
        System.out.println("Non-static methods");
        show();
        print();

    }

     void show()
    {
        System.out.println("This is static method");
    }
    void print()
    {
        System.out.println("This is static method");
    }



    public static void main(String[] args) {

        staticExample s=new staticExample();
        s.display();

    }
}
