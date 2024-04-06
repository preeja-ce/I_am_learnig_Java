public class Functions {

//public void Calc();
    int a= 10;
    int b= 20;
    int f = 30;

    public int Calculator (int a, int b, int shreyansh){
        shreyansh = a + b ;

       return shreyansh;
    }


    public static void main(String[] args) {

       Functions f1 = new Functions();
       int sum;
        sum = f1.Calculator(20,30, 10);
        System.out.println( ""+sum);
        sum = f1.Calculator(50,30,10 );
        System.out.println( ""+sum);

    }


}
