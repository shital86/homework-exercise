/*Write a Java program to convert a decimal number to binary number.

Input Data:
Input a Decimal Number : 5
Expected Output

Binary number is: 101*/
import java.util.Scanner;
public class Program17 {

        public static void main(String args[]) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter a decimal number");
            int n=sc.nextInt();
            int  bin[]=new int[100];
            int i = 0;
            while(n > 0)
            {
                bin[i++] = n%2;
                n = n/2;
            }
            System.out.print("Binary number is : ");
            for(int j = i-1;j >= 0;j--)
            {
                System.out.print(bin[j]);
            }
        }

    }

