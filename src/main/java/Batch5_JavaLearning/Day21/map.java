package Batch5_JavaLearning.Day21;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class map {
    public static void main(String[] args) {

      /*  Map<String,String> hm=new HashMap<>();
        hm.put("ename","Siva");
        hm.put("eid","10002");
        hm.put("esal","200000");
        hm.put("eid","1001");
        hm.put("ename1","Siva");
        System.out.println(hm.size());
        System.out.println(hm.get("ename"));
        System.out.println(hm.keySet());
        System.out.println(hm.values());
        System.out.println(hm.entrySet());
*/
        /*
        LinkedHashMap<String,String> hm=new LinkedHashMap<>();
        hm.put("ename","Siva");
        hm.put("eid","10002");
        hm.put("esal","200000");
        hm.put("eid","1001");
        hm.put("ename1","Siva");
        System.out.println(hm.size());
        System.out.println(hm.get("ename"));
        System.out.println(hm.keySet());
        System.out.println(hm.values());
        System.out.println(hm.entrySet());
        */

        String str="aaabbdddttc";

        //a=3 b=2 d=3 t=2 c=1

        int count;

       char c[]= str.toCharArray();

        HashMap<Character,Integer> hm=new HashMap<>();

        for(int i=0;i<c.length;i++)
        {
            count=0;
            for(int j=0;j<c.length;j++)
            {
                if(c[i]==c[j])
                {
                    count++;
                }
            }
            hm.put(c[i],count);
        }
        System.out.println(hm);
    }
}
