package Batch5_JavaLearning.Day07;

public class StringExample {
    public static void main(String[] args) {
        String s="Sivakumar";
        System.out.println(s);
        //Length()
        System.out.println(s.length());
//Concat
        System.out.println("Addition of Two numbers:"+(100+200));
       String s1= s.concat("welcome");
        System.out.println(s1);
        System.out.println(s1.concat("siva").concat("wel").concat("siva"));
        System.out.println(s1);
        System.out.println(s);

        //chartAt
        System.out.println(s.charAt(8));
        String rev=" ";
        for(int i=s.length()-1;i>=0;i--)
        {
            rev=rev+s.charAt(i);//rev=ra
            System.out.println(rev);
        }
        //Substring()
        System.out.println(s.substring(3));
        System.out.println(s.substring(2,5));

        //toLowercase
        System.out.println(s.toLowerCase());

        //toUppercase
        System.out.println(s.toUpperCase());

        //trim()
        String s5="          welcome to selenium      ";
        System.out.println(s5);

        System.out.println(s5.trim());

        //contains()
        System.out.println(s.contains("Ku"));

        //replace
        String s4="Welcome to Selenium Automation to Java";
        System.out.println(s4);

        //System.out.println(s4.replace('e','a'));
        System.out.println(s4.replace("to","and"));

        //Split()

        String email="sivakumar@gmail.com";
        String s6[]=email.split("@");
        System.out.println(s6[0]);
        System.out.println(s6[1]);

        //equals()
        System.out.println(s.equals("sivakumar"));//

        //equalIgnorecase()
        System.out.println(s.equalsIgnoreCase("sivakumar1"));//


    }
}
