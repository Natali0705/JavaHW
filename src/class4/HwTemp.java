package class4;

import java.util.Scanner;

public class HwTemp {
    public static void main(String[] args) {

        Scanner key=new Scanner(System.in);
        System.out.println("Enter your city");
        String city=key.nextLine();
        System.out.println("Enter temperature in F");
        int temperature=key.nextInt();
        int Cel=(temperature-32)/2;
        System.out.println("The temperature is "+Cel+" the city is "+city);

    }

}
