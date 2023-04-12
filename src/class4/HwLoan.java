package class4;

import java.util.Scanner;

public class HwLoan {
    public static void main(String[] args) {
        Scanner key=new Scanner(System.in);
        System.out.println("what is the amount of loan?");
                  int loan=key.nextInt();


        if(200000<=loan) {
            System.out.println("You get the loan");
                    }else{
            System.out.println("You are rejected");
        }

    }
}
