package class10;
/*

Create 2D array of countries: north america countries, south america countries, europe countries, asian countries, african countries.
Then print all values from that array using 2 different loops and calculate how many total countries been stored.
 */
public class HW6 {
    public static void main(String[] args) {
        String [][] countries={
                {"USA","Canada","Mexico"},
                {"Braz","Bol"},
                {"Bel","Pol","Lith","Greece"},
                {"Kazah","China","Korea"},
                {"UAR","Tunis"},
        };
        int counter=0;
        for (String[] arr1D : countries) {
            for (String count : arr1D) {
                counter++;
                System.out.println(count);

            }
            System.out.println(counter);                   }

    }
}
