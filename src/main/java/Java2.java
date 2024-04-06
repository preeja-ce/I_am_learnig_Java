public class Java2 {

    public static void main(String[] args) {
        int Feedback=0;//declaration
        //Feedback=1;//assignment

        switch(Feedback){

            case 0 :{
                System.out.println( "Did you attend the meeting?");
                break;
            }

            default:{
                System.out.println( "Please provide a valid input");
                break;
            }

            case 1:{
                System.out.println( "Note Good");
                break;
            }

            case 2:{
                System.out.println( "Need Improvement");
                break;
            }

            case 3:{
                System.out.println( "Ok");
                break;
            }

            case 4:{
                System.out.println( "Good");
                break;
            }

            case 5:{
                System.out.println( "Dong Good");
                break;
            }
        }
    }
}
