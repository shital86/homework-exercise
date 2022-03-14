/*Write a Java program to convert a given string into lowercase.
Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
Output: the quick brown fox jumps over the lazy dog.*/

import java.util.Scanner;

public class Program19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a Sentence: ");
        String line = in.nextLine();
        String upper_case_line = "";
        Scanner lineScan = new Scanner(line);
        while (lineScan.hasNext()) {
            String word = lineScan.next();
            upper_case_line += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";
        }
        System.out.println(upper_case_line.trim());
    }
}

