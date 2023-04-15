package class11;

public class E1D2Arrays {
    public static void main(String[] args) {
        int[][] arr = {
                {10, 20, 30, 40, 50}, // =i
                {1, 2, 3, 4, 5},     //=i
                {5, 5, 5, 5, 5},        //=i
                {10, 8, 6, 4, 2}                //=i  rows
                //  j   j  j  j  j    column
        };

        //print  2nd array
        //arr[i]-> gives me the array at specific index by i
        //int[] innerArray=arr[i]; --> innerArray.length

        for (int row = 0; row < arr.length; row++) { //row it is roows
            for (int col = 0; col < arr[row].length; col++) {
                // getting the complete oneD array from 2D array throughh [1]
                if (arr[row][col] % 2!=0) {

                    System.out.print(arr[row][col] + " ");

                }


            }
        }
    }
}
