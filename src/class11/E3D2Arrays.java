package class11;

public class E3D2Arrays {
    public static void main(String[] args) {

        String[][] names2DArray = {
                {"Sara", "Artem", "John", "Alex"}, // name1DArray
                {"Nata", "Kil", "Alica", "Ato"}
        };

        for (String[] name1DArr : names2DArray) {
            for (String name : name1DArr) {
                System.out.println(name);
            }
        }
    }
}
