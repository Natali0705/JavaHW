package class10;
/*   
Using 2D array create a grocery list.
Inside you should have an array of veggies, fruits, dairy and sweets. 
Retrieve all values from that array using 2 different loops

* */
public class HW3 {

    public static void main(String[] args) {
        String [][]listOfProduct={
                {"carrot","potateo","pepres"},
                {"milk","butter","cheese"},
                {"apple","banana","cherry","kiwi"},
                {"mm","tt","bb","aa"}
                               
        };
        for (String[] strings : listOfProduct) {
            for (String string : strings) {
                System.out.print(string+" ");
            }
            
        }
        
    }
}
