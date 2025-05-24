package Batch4_Automation.Day09;

import java.util.Arrays;

public class ex {
    public static void main(String[] args) {

        int a[][]=new int[3][4];
        a[0][0]=100;
        a[0][1]=200;
        a[0][2]=300;
        a[0][3]=400;
        a[1][0]=500;
        a[1][1]=600;
        a[1][2]=700;
        a[1][3]=800;
        a[2][0]=900;
        a[2][1]=1000;
        a[2][2]=1100;
        a[2][3]=1200;

        System.out.println("Array Row Length:"+a.length);
        System.out.println("Array coloumn Length:"+a[0].length);

        System.out.println(a[0][1]);

        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[0].length;j++)
            {
                System.out.print(" " +a[i][j]);
            }
            System.out.println("");

        }

    }
}
