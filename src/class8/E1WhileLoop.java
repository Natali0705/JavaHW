package class8;

import java.util.Scanner;

public class E1WhileLoop {
    public static void main(String[] args) {
        /*numbers from 15 to 30
         // int start=15; int end=30;
        /*int coumter=start;          while (coumter<end){
        System.out.print(coumter+" ");
                    coumter++;                }*/

        Scanner key=new Scanner(System.in);
        System.out.println("Print start, end and step numbers");
        int start=key.nextInt();
        int end= key.nextInt();
        int step=key.nextInt();
        int counter=start;
        while(counter<=end){
            System.out.print(counter+" ");
            counter=counter+step;
          //
        }

        }

    }

