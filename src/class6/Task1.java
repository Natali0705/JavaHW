package class6;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Print you height");
        int heights= scan.nextInt();
        if(heights <60){
            System.out.println("short");
        } else if(heights >=60 && heights<=72){
            System.out.println("medium");
        }else{
            System.out.println("tall");
        }



    }
}
