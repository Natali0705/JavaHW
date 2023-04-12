package class9;

public class E5Aarrays {
    public static void main(String[] args) {

        for (int i = 0; i <5 ; i++) {
            if (i%2==0){
                System.out.print(i+" ");
            }

        }

        char[] num={'a','b','c','d','e','f'};
        System.out.println(num.length);
        for (int i = 0; i<num.length; i++) {
            if(i%2==0){
                System.out.print(num[i]+" ");
            }
        }

    }
}
