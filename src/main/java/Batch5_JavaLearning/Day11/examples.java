package Batch5_JavaLearning.Day11;

public class examples {

    public static void main(String[] args) {
        String s="sivakumar";

        String reverse="";
        for(int i=s.length()-1;i>=0;i--)//7>=0
        {
                reverse=reverse+s.charAt(i);//r +a
        }
        System.out.println(reverse);
    }
   }
