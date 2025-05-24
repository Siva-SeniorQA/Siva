package Batch5_JavaLearning.Day06;

import java.util.Arrays;

public class ArrayExamples {
    public static void main(String[] args) {

        int a[] = {100, 90, 10, 40, 300, 40, 190, 20};

        System.out.println(a.length);
        for(int i=0;i<a.length;i++)
        {
            System.out.println("Before Sorting:"+a[i]);
        }
        Arrays.sort(a);

        for(int i=0;i<a.length;i++)
        {
            System.out.println("After sorting array:"+a[i]);
        }
        System.out.println("Hghest number from Array:"+a[7]);
        System.out.println("Lowest value:"+a[0]);



    }
}
