package Assignments.Assignment1;

public class Pattern1 {

    public static void main(String[] args) {

        Pattern1 p1 = new Pattern1();
        p1.approach1();
        p1.approach2();
    }

    public void approach1() {
        int i;
        int j;
        for (i = 0; i < 3; i++) {

            for (j = 4; j > i; j--) {
                System.out.print("*");

                //System.out.println( "");
            }
            System.out.println("*");


        }
    }
    /*
    *****
    ****
    ***

    */

    public void approach2() {

        System.out.println( "This is approach2");
        int i;
        int j;
        int maxlength = 6;
        for (i = 0; i < maxlength; i++) {

            for (j = 0; j < maxlength-i; j++) {
                System.out.print("*");

                //System.out.println( "");
            }
            System.out.println(" ");


        }
    }

}

