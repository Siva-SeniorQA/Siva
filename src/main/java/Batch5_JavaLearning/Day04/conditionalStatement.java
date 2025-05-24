package Batch5_JavaLearning.Day04;

public class conditionalStatement {

    public static void main(String[] args) {

      /*  //if Statement

        if(100>500)
        {
            System.out.println("100 is Greater");
        }

//if else
        int age=30;
        if(age<=18)
        {
            System.out.println("Eligible for vote");
        }
        else
        {
            System.out.println("Not eligible for vote");
        }

        //Nest if else

        int a=100,b=200,c=30;

        if(a>b && a>c)
        {
            System.out.println("A is greater");
        }
else if (b>a && b>c)
        {
            System.out.println("B is greater");
        }
else
        {
            System.out.println("C is greater");
        }

//Case-2:

        int weekday=8;

        if(weekday==1)//4==1
        {
            System.out.println("Sunday");
        }
        else if(weekday==2)//4==2
        {
            System.out.println("Monday");
        } else if (weekday==3) //4==3
        {
            System.out.println("Tuesday");

        }
        else if(weekday==4)//4==4
        {
            System.out.println("Wednesday");
        }
         else if (weekday==5) {
            System.out.println("Thursday");

        }
        else if(weekday==6)
        {
            System.out.println("Friday");
        }
        else if(weekday==7)
        {
            System.out.println("Saturday");
        }
else
        {
            System.out.println("Invalid Date");
        }
*/
//Switch Case

        int weeknumber=15;

switch(weeknumber)
{
    case 1: System.out.println("sunday");break;
    case 2: System.out.println("manday");break;
    case 3: System.out.println("Tuesday");break;
    case 4: System.out.println("Wednesday");break;
    case 5: System.out.println("Thursday");break;
    case 6: System.out.println("Friday");break;
    case 7: System.out.println("Saturday");break;
    default:
        System.out.println("Invaid date");
}
    }
}
