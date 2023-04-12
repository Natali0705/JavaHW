package class4;

import java.util.Scanner;

public class HwDmv {
    public static void main(String[] args) {
        Scanner key=new Scanner(System.in);
        System.out.println("What is your age?");
        int age=key.nextInt();
        if(age>18){
            System.out.println("You can get DL");
        }else{
            System.out.println("You can get permit");
        }
    }
}
