package class9;

public class E8Arrays {
    public static void main(String[] args) {

       // int[] num={6,5,4,3,2,1,0};

        for (int i = 6; i >=0 ; i--) {
            System.out.print(i+" ");
        }

        System.out.println();
        System.out.println();

        char[] letters={'A','B','C','D','E','F'};
        for (int i =letters.length-1 ; i >=0; i--) { // -1 because begins from 0
            System.out.println(i+" "+letters[i]);
        }
    }
}
