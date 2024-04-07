package Assignments.Assignment1;

public class Pattern2 {

    public static void main(String[] args) {
        Pattern2 A1 = new Pattern2();
        A1.approach1();
        A1.approach2();
    }




        public void approach1(){
            int i;
            int j;

           for(i=0; i<4;i++) {

            for(j=0;i>j;j++)
            {
                System.out.print("*");
            }
            System.out.println("*");


        }
    }
    /*

     *
     **
     ***
     ****

     */
        public void approach2(){
            System.out.println( "This is approach2");
            int i;
            int j;

            int maxLength =7;
            for (i=0; i<maxLength; i++)
            {
                for(j=maxLength; j>(maxLength-i);j--)
                {
                    System.out.print("*");
                }
                System.out.println(" ");
            }
        }


}
