package Vignesh_Automation;

public class maxnumber {
    public static void main(String[] args) {

        int a[]={1,10,30,40,500};

        int max=a[0];//30//40//500

        for(int i=1;i<a.length;i++)
        {
            if(a[i]<max)//30>10//40>30//500>40
            {
                max=a[i];//30//40//500
            }

        }
        System.out.println(max);
    }
}
