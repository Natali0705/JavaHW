package class4;

import java.util.Scanner;

public class Weekends {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("Enter the number of weekday");
        int numberOfDay = key.nextInt();
        if (numberOfDay <= 5) {
            System.out.println("It is a weekday");
        }  else if(numberOfDay==6) {
            System.out.println("Lucky!It is a weekend");}
            else if(numberOfDay==7){
                System.out.println("Lucky!It is a weekend");
                          }
         else if(numberOfDay>7){
            System.out.println("The other day");
        }
    }


    }

