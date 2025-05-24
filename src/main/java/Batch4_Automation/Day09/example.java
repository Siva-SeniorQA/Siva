package Batch4_Automation.Day09;

public class example {

    public static void main(String[] args) {
/*
        int start=2;
        int last=100;


        for(int i=start;i<=last;i++)//3
        {
            int check=0;
            for(int j=1;j<=i;j++)
            {
                if(i%j==0)
                {
                   check++;
                }
            }
            if(check==2)
            {
                System.out.println(i);//2
            }
        }
*/
int i,j;
        for(i=1;i<=100;i++)
        {
            for(j=2;j<i;j++) {
                if (i % j == 0)
                    break;
            }

                if(i==j)
                {
                    System.out.println(i);//2 3
                }
            }


        }

    }

