package class11;

public class E4D2Arrays {
    public static void main(String[] args) {
        int[][] arr2D = {
                {10, 20, 30, 40, 50}, // =i
                {1, 2, 3, 4, 5},     //=i
                {5, 5, 5, 5, 5},        //=i
                {10, 8, 6, 4, 2}                //=i  rows
                //  j   j  j  j  j    column
        };


        for (int[] arr1D : arr2D) {
            for (int num : arr1D) {
                System.out.println(num);
            }
        }
    }
}


