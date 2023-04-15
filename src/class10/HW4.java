package class10;
/* Create a 2D array or integer type and store numbers in 3 rows and 3 columns.
Print the sum of all numbers.   */
public class HW4 {
    public static void main(String[] args) {
        int sum=0;
        int [][] num={
           {1,2,3,4,5},
           {4,5,6},
           {7,100,2}

   };

        for (int[] arr1D : num) {
            for (int i : arr1D) {
                sum=sum+i;
            }
            System.out.println(sum);
            sum=0;

        }



        }
    }

