package class10;
/* Create 2D array of cars : american, german, korean, italian.
 Then retrieve all values from that array using 2 different loops*/
public class HW2 {
    public static void main(String[] args) {
        String [][] cars= {
                {"american", "german" },
                {"korean", "italian"}
        };
        for (int i = 0; i < cars.length ; i++) {
            for (int j = 0; j < cars[i].length ; j++) {
                System.out.println(cars[i][j]);
            }

        }

        for (String[] car : cars) {
            for (String carTwo : car) {
                System.out.print(carTwo+" ");
            }


        }

    }



}
