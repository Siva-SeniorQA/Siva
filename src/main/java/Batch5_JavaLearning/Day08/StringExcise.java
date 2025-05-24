package Batch5_JavaLearning.Day08;

public class StringExcise {

    public static void main(String[] args) {

        String s1="welcome";
        String s2="welcome";
        String s3="Welcome";
        String str1=new String("welcome");
        String str2=new String("welcome");
        String str3=new String("Welcome");

        System.out.println(s1.equals(s2));//true
        System.out.println(s1.equals(s3));//false
        System.out.println(s1.equals(str1));//true
        System.out.println(str1.equals(str2));//true
        System.out.println(s3.equals(str3));//true

        System.out.println(s1==s2);//true
        System.out.println(s1==str1);//false
        System.out.println(str1==str2);//false


    }
}
