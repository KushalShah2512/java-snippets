/*
  Q: Write a Java program that takes five numbers as input 
     to calculate and print the average of the numbers.

  Example:
  Input: 5 numbers → 10 20 30 40 50
  Output:
    Average: 30.0
*/

import java.util.*;

class avg {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            sum += sc.nextInt();
        }

        System.out.println("Average: " + (sum / 5.0));
    }
}
