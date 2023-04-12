package class8;

import java.util.Scanner;

public class E2WhileLoop {
    public static void main(String[] args) {
        Scanner key=new Scanner(System.in);
        System.out.println("Enter the number");
        int anyNumber=key.nextInt();

        while(anyNumber!=-1){
            System.out.println("Hello World! ");
            System.out.println("Enter the number");
            anyNumber=key.nextInt(); //when we repeat to print line no INT
        }
    }
}
