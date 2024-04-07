package Assignments;

public class Task2 {

    public static void main(String[] args) {
            Task2 t1 = new Task2();

        //Q1 - Print Greatest of all
        System.out.println("Greatest Number is " +t1.findGreatestNumber_A2(128,128,88));

        //Q2 - Print numbers from X to 0
        t1.printNumbers(22);
        System.out.println("");

        //Q3 - Factorial of number X
        System.out.println( "The factorial is " +t1.Factorial(10));

        //Q4 - Reverse Array
        t1.reverseArray();

        //Q5 - Sum of 2 numbers
        System.out.println( " The sum is " +t1.Sum(10,12));
    }


        /*  2,1,0
        2,0,1
        1,2,0
        1,0,2
        0,1,2
        0,2,1
        */

    public int findGreatestNumber_A1(int a, int b, int c){
        int greatestNumber = a;

        if (b> greatestNumber)
            if(c>b)
                greatestNumber = c;
            else
                greatestNumber = b;
        else
            if(c>a)
                greatestNumber = c;
            else
                greatestNumber = a;

        return greatestNumber;
    }


    public int findGreatestNumber_A2(int a, int b, int c) {
        if (b > a)
            if (c > b) {
                System.out.println("" + c);
                return c;
            } else {
                System.out.println("" + b);
                return b;
            }
        else if (c > a) {

            System.out.println("" + c);
            return c;
        } else {
            System.out.println("" + a);
            return a;
        }
    }

    public int findGreatestNumber_A3(int a, int b, int c) {
        if (b > a)
            return Math.max(b,c);

        else
            return Math.max(a,c);

    }

    public void printNumbers(int x){
        for (int a=x;a>=0;a--)
        {
            System.out.print(" "+a);
        }
    }

    public int Factorial(int x){
        int result=1;
        for (int a=x;a>0;a--)
        {
            result = result * a;
        }
        return result;
    }

    public void reverseArray(){
        int [] numList= { 12, 10, 324, 5, 1, 2};
        int numSize = numList.length;

        for (int i=numSize-1; i>=0; i--)

        {
            System.out.print( " "+numList[i]);

        }

    }

        public int Sum(int a, int b)
        {

            System.out.println("" );
            return (a+b);

        }

    }
