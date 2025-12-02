/*
  Q: Write a Java program to count the letters, spaces, numbers,
     and other characters of an input string.

  Example:
  Input: "Hello 123 @#$"
  Output:
    Letters: 5
    Spaces : 2
    Numbers: 3
    Others : 3
*/

import java.util.*;

class countCharacters {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = sc.nextLine();

        int letters = 0, spaces = 0, numbers = 0, others = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isLetter(ch)) {
                letters++;
            } 
            else if (Character.isDigit(ch)) {
                numbers++;
            } 
            else if (Character.isWhitespace(ch)) {
                spaces++;
            } 
            else {
                others++;
            }
        }

        System.out.println("Letters: " + letters);
        System.out.println("Spaces : " + spaces);
        System.out.println("Numbers: " + numbers);
        System.out.println("Others : " + others);
    }
}
