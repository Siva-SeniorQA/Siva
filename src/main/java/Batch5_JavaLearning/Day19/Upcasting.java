package Batch5_JavaLearning.Day19;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Upcasting {

    public static void main(String[] args) {

        //upcasting/Widening casting-->smaller to larger datatypes

        byte b=126;
        System.out.println(b);

        short s=b;
        System.out.println(s);
        int i=s;//Autometic

        System.out.println(i);

        //Downcasting/narrow casting ->larger to smaller
        int in=137;
        System.out.println(in);
        byte b1=(byte)in;
        System.out.println(b1);

        long l=78654958536666L;
        int in1=(int)l;
        System.out.println(in1);
    }

    public static class arraylist1 {
        public static void main(String[] args) {

            ArrayList<String > arr=new ArrayList<>();
            arr.add("Siva");
            //arr.add("siva");
            arr.add("Kumar");

            System.out.println(arr);

            List<String> list=new ArrayList();
            List<Integer> list1=new LinkedList();

        }
    }
}
