package Batch5_JavaLearning.Day20;

import java.util.ArrayList;

public class arrayList {

    public static void main(String[] args) {


        ArrayList list=new ArrayList();
        System.out.println(list.isEmpty());
        list.add("Siva");
        list.add('C');
        list.add(1009);
        list.add(true);
        list.add("Siva");
        list.add(null);
        list.add(null);
        System.out.println(list);

        System.out.println(list.size());
        System.out.println(list.isEmpty());

        System.out.println(list.contains("siva"));
        System.out.println(list.remove(2));
        System.out.println(list.remove(null));
        System.out.println(list);

        //System.out.println(list.equals("Siva"));

        System.out.println(list.removeFirst());
        System.out.println(list);

        list.add("Siva");
        list.add('C');
        list.add(1009);
        list.add(true);
        list.add("Siva");
        list.add(null);
        list.add(null);
        System.out.println(list);

        ArrayList list1=new ArrayList();
        list1.addAll(list);
        System.out.println(list1);
//        for(Object ob:list1)
//        {
//            System.out.println(ob);
//        }

        for(int i=0;i<list1.size();i++)
        {
            System.out.println(list1.get(i));
        }







    }
}
