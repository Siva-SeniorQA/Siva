package Batch5_JavaLearning.Day18;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

public class checkedExceptions {
    public static void main(String[] args) throws FileNotFoundException, InterruptedException {

        System.out.println("welcome1");
        Thread.sleep(5000);
        System.out.println("welcome");

        FileInputStream file=new FileInputStream("C:\\text.txt");
        System.out.println("welcome");

    }
}
