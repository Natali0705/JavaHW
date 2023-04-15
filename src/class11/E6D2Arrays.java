package class11;

public class E6D2Arrays {
    public static void main(String[] args) {
        int sum=0;
        int[][] arr2D = {
                {10, 20, 30, 40, 50}, // =i
                {1, 2, 3, 4, 5},     //=i
                {5, 5, 5, 5, 5},        //=i
                {10, 8, 6, 4, 2}                //=i  rows
                };

        for (int[] arr1D : arr2D) {
            for (int num : arr1D) {
                sum=sum+num;
            }
            System.out.println(sum);
            sum=0; //gives opportunity to print new row from beginning

        }

            }

        }




