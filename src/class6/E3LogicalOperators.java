package class6;

public class E3LogicalOperators {
    public static void main(String[] args) {

        boolean rich=true;
        boolean invitationFrommRR=false;

        if(rich && invitationFrommRR){ //t and f->f, so will print else part
            System.out.println("Yes, You can buy RR");

        }else{
            System.out.println("You can't buy RR");
        }

    }
}
