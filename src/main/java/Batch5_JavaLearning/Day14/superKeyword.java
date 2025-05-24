package Batch5_JavaLearning.Day14;

class cow
{
    String color="blue";
    void displaycolor()
    {
        System.out.println(color);
    }
}

class dog extends cow
{
    String color="black";
    void displaycolor()
    {
        super.displaycolor();
        //System.out.println(super.color);
        System.out.println(color);
    }
}

public class superKeyword {

    public static void main(String[] args) {
        dog d=new dog();
       d.displaycolor();
    }
}
