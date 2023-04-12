package class9;

public class E5Arrays {
    public static void main(String[] args) {

        String [] names={"Anna","Mila","Olga","Ira","Kate"};
        System.out.println(names.length);
        for (int i = 0; i <names.length ; i++) {
            System.out.println( names[i]);

        }
        System.out.println();
        int counter=0;
        while(counter<names.length){
            System.out.print(names[counter]+ " ");
            counter++;
        }
    }
}
