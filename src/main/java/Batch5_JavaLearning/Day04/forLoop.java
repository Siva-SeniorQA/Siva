package Batch5_JavaLearning.Day04;

public class forLoop {

    public static void main(String[] args) {

        //
       /*  for(int i=0;i<=100;i++)
        {
            if(i%2==1) {
                System.out.println(i);//1 2
            }
        }
        */
        //

        for(int i=100;i>0;i--)
        {
            if(i==50)
            {
                continue;
            }
            System.out.println(i);
        }
    }

}
