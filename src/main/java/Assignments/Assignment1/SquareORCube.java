package Assignments.Assignment1;

public class SquareORCube {

    public static void main(String[] args) {
        SquareORCube sc = new SquareORCube();
        int result = sc.calculator(2,2, "cube");
        System.out.println( result);
    }

    public int calculator(int a, int b, String CalcultionType)
    {
        int result=0;
        if (CalcultionType == "square")
        {
            result = ((a*a) + (b*b) + (2*a*b));
        }
        else if (CalcultionType == "cube")
        {
            result = ((a*a*a) + (b*b*b) + (3*a*a*b) + (3*a*b*b));
        }
        return result;
    }
}
