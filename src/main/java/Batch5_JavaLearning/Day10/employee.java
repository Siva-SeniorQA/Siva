package Batch5_JavaLearning.Day10;

public class employee {

    int eid;
    String ename;

    private void display()
    {
        System.out.println("private methods");
    }
     void display1()
    {
        System.out.println("Default methods");
    }

   protected void display2()
    {
        System.out.println("Protected Methods");
    }
   public void display4()
    {
        System.out.println("Public method");
    }







    public static void main(String[] args) {

employee e=new employee();
e.display();
    }
}
