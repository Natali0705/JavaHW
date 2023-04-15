package class10;

/*
Create a 2D array or integer type where you will
store odd and even numbers in 3 rows and 4 columns.
Develop a program which will identify/print the even numbers only.

 */
public class HW5 {
    public static void main(String[] args) {
        int[][] num = {
                {2, 4, 5},
                {1, 8, 9},
                {2, 5, 9}
        };
        for (int[] arrD1 : num) {
            for (int amnt : arrD1) {
                if (amnt%2==0)
                {
                    System.out.print(amnt + " ");
                }

            }
            System.out.println(); }

    }
}