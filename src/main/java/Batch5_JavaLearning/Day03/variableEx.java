package Batch5_JavaLearning.Day03;

public class variableEx { int x=100;
    //Approach-2


    public void display()
    {
        int x=100;
        //Approach-2
        int y,z;
        y=10;
        z=1000;
        //Approach-3
        int a=10,b=20,c=30;

        int i=10;
        System.out.println(i);//10

        System.out.println(i+i);//20

        i=100;//current

        System.out.println(i);//100

        System.out.println(i+i);//200

        i=500;
        System.out.println(i+i);
    }

    public static void main(String arg[])
    {
        //Approach-1
      variableEx e=new variableEx();
      e.display();



    }
}
