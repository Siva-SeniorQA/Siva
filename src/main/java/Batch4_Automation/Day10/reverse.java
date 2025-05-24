package Batch4_Automation.Day10;

public class reverse {

    public static void main(String[] args) {

        int i,j;
        for(i=1;i<=100;i++)//2<=100
        {
            for(j=2;j<i;j++) { //2<2

                if (i % j == 0)//3%2
                    break;
            }

            if(i==j)//2==2
            {
                System.out.println(i);//2
            }
        }


    }
}
