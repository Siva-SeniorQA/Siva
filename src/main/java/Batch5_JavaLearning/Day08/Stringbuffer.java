package Batch5_JavaLearning.Day08;

public class Stringbuffer {

    public static void main(String[] args) {

        StringBuffer str=new StringBuffer("Welcome");
        System.out.println(str);

        System.out.println(str.append("to java"));
        System.out.println(str);

        System.out.println(str.reverse());

        System.out.println(str.length());
        System.out.println(str.charAt(0));

    }
}
