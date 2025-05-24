package Batch5_JavaLearning.Day16;

public class Wrappercalss {
    public static void main(String[] args) {

        //String to primitive datatypes
        String s="Siva";
        System.out.println(s);
       boolean result=Boolean.parseBoolean(s);
        System.out.println(result);

        int a=Integer.parseInt(s);
        System.out.println(a);

       short s1= Short.parseShort(s);
        System.out.println(s1);

        double d=Double.parseDouble(s);
        System.out.println(d);


//primitive Datatypes to String

        int num=1000;
        System.out.println(num);
        String s4=String.valueOf('C');
        System.out.println(s4);




    }
}
