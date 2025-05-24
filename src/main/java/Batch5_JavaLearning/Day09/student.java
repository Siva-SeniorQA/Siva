package Batch5_JavaLearning.Day09;

public class student {

    int sid=100;
    String sname="siva";

    String dept="IT";
    char grade='A';

    void studentdisplay()
    {

        System.out.println(sid);
        System.out.println(sname);
        System.out.println(dept);
        System.out.println(grade);
    }

    void student2display()
    {
        sid=300;
        sname="ravi";
        dept="ECE";
        grade='E';


        System.out.println(sid);
        System.out.println(sname);
        System.out.println(dept);
        System.out.println(grade);
    }

    public static void main(String[] args) {
        student stu=new student();
        stu.studentdisplay();
        stu.student2display();
    }

}
