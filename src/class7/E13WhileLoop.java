package class7;

import java.util.Scanner;

public class E13WhileLoop {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("Enter any number greater than 1");
        int numbers = key.nextInt();
        int counter = 1;
        while (counter <= numbers) {
            System.out.println(counter + " ");
            counter++;
        }
    }
}

