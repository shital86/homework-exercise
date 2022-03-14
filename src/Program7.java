/*Write a program to insert any temperature value in degree Fahrenheit and
convert to degree Celsius ((F − 32) × 5/9 = 0°C).*/

import java.util.Scanner;

public class Program7 {


    double celsius(double f) {
        return (f - 32) * 5 / 9;
    }

    public static void main(String arg[]) {
        double a, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  Fahrenheit temperature");
        a = sc.nextDouble();
        Program7 program7 = new Program7();
        double result = program7.celsius(a);
        System.out.println("Celsius temperature is = " + result);
    }
}


