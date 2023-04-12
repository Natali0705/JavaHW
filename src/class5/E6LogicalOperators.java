package class5;

public class E6LogicalOperators {
    public static void main(String[] args) {

       // System.out.println(true ||true||false);
        int age=70;

        if(age<18 || age>60){
            System.out.println("You will get discount");

        }

        String gender="F";
        String name="Mary";
        int age1=61;
        if(gender.equals("F") || age1>60 || name!="Mary"){
            System.out.println("You get discount 2");
        }
    }
}
