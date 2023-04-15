package class10;

import java.util.Scanner;

public class Hw {
    public static void main(String[] args) {


        int [] elem=new int[5];
        Scanner key=new Scanner(System.in);

        for (int i = 0; i <6 ; i++) {
            elem[i]=key.nextInt();
            System.out.println(elem);

        }
        for (int i : elem) {
            System.out.println(i);

        }


    }


}



