package Assignments;

public class SquareORCube {

    private static int result;

    public static void main(String[] args) {

        int result = calculator(2,2, "cube");
        System.out.println( result);

    }

    public static int calculator(int a, int b, String CalcultionType)
    {
        if (CalcultionType == "square")
        {
            int result = ((a*a) + (b*b) + (2*a*b));
            return result;
        }
        else if (CalcultionType == "cube")
        {
            int result = ((a*a*a) + (b*b*b) + (3*a*a*b) + (3*a*b*b));
            return result;
        }
        return result;
    }
}
