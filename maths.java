/*
  Q: Write a Java program to print the sum, multiply, subtract, divide
     and remainder of two numbers.

  Example:
  Input: a = 10, b = 5
  Output:
    Add: 15
    Sub: 5
    Mul: 50
    Div: 2
    Rem: 0
*/

import java.util.*;

class maths {
    public static void main(String args[]) {
        int a = 10, b = 5;

        System.out.println("Add: " + (a + b));
        System.out.println("Sub: " + (a - b));
        System.out.println("Mul: " + (a * b));
        System.out.println("Div: " + (a / b));
        System.out.println("Rem: " + (a % b));
    }
}
