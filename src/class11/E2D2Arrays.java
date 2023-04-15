package class11;

public class E2D2Arrays {
    public static void main(String[] args) {

        String[][] names={
                {"Sara","Artem","John","Alex"},
                {"Nata","Kil","Alica","Ato"}
        };

        for (int i = 0; i < names.length ; i++) {
            for (int j = 0; j < names[i].length ; j++) {
                System.out.println(names[i][j]);
            }

        }

    }
}
