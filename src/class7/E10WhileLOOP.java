package class7;

public class E10WhileLOOP {
    public static void main(String[] args) {
        //1 2 4 5 7 8 10 11 13

        int counter=1;
        while(counter<21 ){
            if(counter%3!=0)  {
            //(counter!=3&&counter!=6&&counter!=9&&counter!=12)
            System.out.print(counter+" ");
            }
            counter++;
        }
    }
}
