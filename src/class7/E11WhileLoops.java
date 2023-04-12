package class7;

public class E11WhileLoops {
    public static void main(String[] args) {
        int counter = 100;
        while (counter > 0) {
            System.out.print(counter + " ");
            counter -= 1;

        }
        //assigning a new value to the counter for next loop
        counter = 20; //even numbers to print
        System.out.println();
        while (counter <= 100) {
            System.out.print(counter + " ");
            counter += 2;

        }

        counter = 100;
        // sout gives output in a new line
        System.out.println();
        while (counter > 0) {
            // odd numbers when divided by 2 gives 1 as reminder
            if (counter % 2 == 1) {
                System.out.print(counter + " ");
            }
            counter--;

        }
    }
}





