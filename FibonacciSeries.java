package java_projects;

import java.sql.SQLOutput;
import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[]args){

        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter number = ");
        int n=scanner.nextInt();
        int a=0;
        int b=1;

        System.out.println("it print"+n+"terms:");
        System.out.print("series ="+a+", "+b);
        for(int i=1; i<=n; ++i){

            int c = a+b;
            a = b;
            b = c;
            System.out.print(" , "+c);

        }
    }
}
