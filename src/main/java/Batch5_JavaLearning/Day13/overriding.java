package Batch5_JavaLearning.Day13;

class RBI
{
   double roi(double interest)
    {
        interest=12.10;
        return interest;
    }

}

class hdfc extends RBI
{
    double roi(double interest)
    {
        interest=10.50;
        return interest;
    }
}

class icici extends hdfc
{
    double roi(double interest)
    {
        interest=9.50;
        return interest;
    }
}


public class overriding {

    public static void main(String[] args) {
        icici i=new icici();
        System.out.println(i.roi(10));
    }

}
