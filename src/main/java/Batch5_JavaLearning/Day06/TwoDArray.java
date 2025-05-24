package Batch5_JavaLearning.Day06;

public class TwoDArray {
    public static void main(String[] args) {
      /*  int a[][]=new int[2][3];

        a[0][0]=100;
        a[1][0]=200;
        a[0][2]=300;
        a[0][1]=900;

       int row= a.length;
        System.out.println(row);
      int coloumn=  a[0].length;

      /*  System.out.println(a[1][1]);
        System.out.println(a[1][2]);

        System.out.println("Row Length:"+a.length);
        System.out.println("Column Length:"+ a[0].length);

        for(int i=0;i<row;i++) //1<2
        {
            for(int j=0;j<coloumn;j++)//3<3
            {
                System.out.print(a[i][j]+ " ");//a[0][0]//100//a[0][1] a[0][2]//300
                                                //a[1][0]
            }
            System.out.println("  ");
        }
*/
        int a[][]={ {100,200,300},{400,500,600}};

        int row=a.length;
        int collumn=a[0].length;

        for(int i=0;i<row;i++)
        {
            for(int j=0;j<collumn;j++)
            {
                System.out.print(a[i] [j]+ " ");
            }
            System.out.println(" ");
        }


    }
}
