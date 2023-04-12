package class3;

public class E14TypeCasting {
    public static void main(String[] args) {

     short num=1200;
      byte num2=(byte)num;
        System.out.println(num2); //-80 we lost numbers

        short num3=120;
        byte num4=(byte)num3;
        System.out.println(num4);
    }
}
