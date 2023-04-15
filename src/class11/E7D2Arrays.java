package class11;

public class E7D2Arrays {
    public static void main(String[] args) {

        boolean[][] arr2D = {
                {true, false, true, true, false},
                {true, false, false, false, false}

        };


        int counter = 0;
        for (boolean[] arr1D : arr2D) {
            for (boolean num : arr1D) {
                if (num == true) {

                    counter++;
                }
            }


        }
        System.out.println(counter);

    }
}







