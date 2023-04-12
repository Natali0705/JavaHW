package class5;

import java.util.Scanner;

public class E3IfElse {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Print your age");
        int age=sc.nextInt();

        if(age<18){
            System.out.println("you can not drive");
        } else {
            System.out.println("you can drive");
        }


    }
}
