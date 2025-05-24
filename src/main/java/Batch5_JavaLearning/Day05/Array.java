package Batch5_JavaLearning.Day05;

public class Array {

    public static void main(String[] args) {

        //Approach-1
/*
        int a[]=new int[5];

        a[0]=100;
        a[1]=200;
        a[2]=300;
        a[3]=400;
        a[4]=500;
        //a[5]=600;

        System.out.println(a.length);
        System.out.println(a[1]);
        System.out.println(a[3]);


        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);//100 200
        }
*/
        //Apparoach-2

        int a1[]={10,20,30,40,50,20,30,38};//Dec & value assigning

        System.out.println(a1.length);
        System.out.println(a1[0]);
        System.out.println(a1[7]);

        for(int i=0;i<a1.length;i++)
        {
            System.out.println(a1[i]);
        }

    }
}
