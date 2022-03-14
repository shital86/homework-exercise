/*Write a Java program to swap two variables.*/
import java.util.Scanner;

public class Program15 {
        private static Scanner sc;

        public static void main(String[] args) {

            int a, b, temp;
            sc = new Scanner(System.in);

            System.out.print(" Please Enter the First : ");
            a = sc.nextInt();

            System.out.print(" Please Enter the Second : ");
            b = sc.nextInt();

            System.out.println("\n Before : a =  " + a + " and b =  " + b);

            temp = a;
            a = b;
            b = temp;

            System.out.println("\n After :  a =  " + a + " and b =  " + b);
        }

    }
