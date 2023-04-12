package class9;

public class E11Arrays {
    public static void main(String[] args) {

        /*
        2 ways of creating arrays:
        1-> int[] num={6,5,4,3,2,1,0}; - we assign values in array;
        2-> int [] numbers=new int[5]; -create an array of int with size 5; reserve 5 places to store;it fixed;

         */

        int[] numbers = new int[5];
        numbers[0] = 50;
        numbers[1] = 60;
        numbers[2] = 70;
        numbers[3] = 80;
        numbers[4] = 90;

        for (int number : numbers) {
            System.out.println(number);


        }
    }
}


