package Batch5_JavaLearning.Day21;

import Batch5_JavaLearning.Day20.Linkedlist;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class hashSet {
    public static void main(String[] args) {
/*
        HashSet hash=new HashSet();
        System.out.println(hash.isEmpty());
        hash.add("Siva");
        hash.add(1001);
        hash.add(true);
        hash.add(false);
        hash.add(10.30);
        hash.add('B');
        hash.add(null);
        hash.add("Siva");
        hash.add(null);
        hash.add(null);
        hash.add("siva");

        System.out.println(hash);

        System.out.println(hash.size());
        System.out.println(hash.contains(false));//true
        System.out.println(hash.remove(null));
        System.out.println(hash);
        HashSet hash1=new HashSet();
        hash1.addAll(hash);
        System.out.println(hash1);

*/
        /*
        LinkedHashSet hash=new LinkedHashSet();
        System.out.println(hash.isEmpty());
        hash.add("Siva");
        hash.add(1001);
        hash.add(true);
        hash.add(false);
        hash.add(10.30);
        hash.add('B');
        hash.add(null);
        hash.add("Siva");
        hash.add(null);
        hash.add(null);
        hash.add("siva");

        System.out.println(hash);

        System.out.println(hash.size());
        System.out.println(hash.contains(false));//true
        System.out.println(hash.remove(null));
        System.out.println(hash);
        */

        TreeSet hash=new TreeSet();
        System.out.println(hash.isEmpty());
        hash.add("Siva");
        hash.add("1001");
        hash.add("1001");
        hash.add("siva");
        hash.add("Banana");
       hash.add("Apple");




        System.out.println(hash);

        System.out.println(hash.size());
        System.out.println(hash.contains("Siva"));//true

        System.out.println(hash);
    }
}
