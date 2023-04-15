package class10;

import javax.management.MBeanAttributeInfo;

public class HW1 {
    /* Create a 2D array(shorter way) in which first array will consist
        of 4 names and second array will contain grades. Then your program
        should print name of the students that has A and B grade */
    public static void main(String[] args) {
        String [][] namesGrades= {{ "Anna", "Beatta","Cara","Mara"},
                {"A","B","A","C"}

        };
        System.out.println(namesGrades[0][0]);
        System.out.println(namesGrades[0][1]);
        System.out.println(namesGrades[0][2]);
    }
}
