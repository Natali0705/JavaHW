package class9;

public class E3Arrays {
    public static void main(String[] args) {

        double[] numbers={10.5,5.5,0.05,100.5,586};
        System.out.println(numbers.length);
        //int i=4;  // int change number of index
        //System.out.println(numbers[4]);
       /* i=1;
        System.out.println(numbers[i]);
        i=2;
        System.out.println(numbers[i]);
        System.out.println(numbers[3]);
        System.out.println(numbers[4]); */

        for (int j = 0; j <numbers.length ; j++) {
           // System.out.println(j); //01234
            // // System.out.println(j); //44444 if j<4
            System.out.print(numbers[j]+" ");

        }
    }
}
