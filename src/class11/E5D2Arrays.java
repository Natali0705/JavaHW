package class11;

import java.util.Enumeration;

public class E5D2Arrays {
    public static void main(String[] args) {
        int counter=0;
        int[][] arr2D = {
                {10, 20, 30, 40, 50}, // =i
                {1, 2, 3, 4, 5},     //=i
                {5, 5, 5, 5, 5},        //=i
                {10, 8, 6, 4, 2}                //=i  rows
                //  j   j  j  j  j    column
        };

        for (int[] arr1D : arr2D) {
            for (int num : arr1D) {
                if(num%2==0){
                    counter++; //increment even value that find by one, function to count amount of even numbers

            }

        }

            }
        System.out.println(counter);
        }
    }



