package Batch5_JavaLearning.Day17;

public class exceptionHandling {

    public static void main(String[] args) {
        System.out.println("welcome");
        System.out.println("welcome");
        System.out.println("welcome");

try {
    System.out.println(10 / 0);
}

catch (StringIndexOutOfBoundsException e)
{
    System.out.println(e);
}
//catch (ArithmeticException e)
//{
//    System.out.println(e);
//}
catch (ArrayIndexOutOfBoundsException e)
{
    System.out.println(e);
}
catch (Exception e)
{
    System.out.println(e);
}
        System.out.println("Normal");
        System.out.println("Normal2");





    }
}
