package class10;

import java.util.Scanner;

public class Task1 {
    /*
Create an array of chars and store grades into it: A,B,C,D.
Then print a grade B (use 2 different ways of creating an array).
 */

        public static void main(String[] args) {
            char[] letters = {'a', 'b', 'c', 'd'};
            System.out.println(letters[1]);

            char[]grades2=new char[4];
            grades2 [0]='A';
            grades2 [1]='B';
            grades2 [2]='C';
            grades2 [3]='D';
            System.out.println(grades2[1]);
        }
}
