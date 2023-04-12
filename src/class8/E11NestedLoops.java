package class8;


    public class E11NestedLoops {
        // use one while and one for loop 1:59
    /*
    2 4 6 8 10
    2 4 6 8 10
    2 4 6 8 10
    2 4 6 8 10
     */
        public static void main(String[] args) {

            int counter=0;
            while (counter<4){
                for (int i = 2; i <=10 ; i=i+2) {
                    System.out.print(i+" ");
                }
                System.out.println();
                counter++;
            }

        }

    }  /* int counter=0;
        while (counter<4)
        or (int i = 0; i <4; i++) {
            for (int j = 2; j <11 ; j=j+2) { //"2"+" "+"4"+" "+"6"+" "+"8"+" "+"10" -code help to execute these
                System.out.print(j+" ");

            }
            System.out.println();
            counter==;
            */
