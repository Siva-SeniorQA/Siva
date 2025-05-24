package Batch5_JavaLearning.Day11;

public class thisKeyword {

    int a=100;
    int b=200;
    int c;

    void add(int a,int b)
    {
        a=10;
        b=20;
        c=this.a+this.b;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        System.out.println(this.a);
        System.out.println(this.b);

    }

    public static void main(String[] args) {

        thisKeyword t=new thisKeyword();
        t.add(10,20);

    }
}
