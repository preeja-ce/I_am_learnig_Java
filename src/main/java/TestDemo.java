import java.sql.SQLOutput;

public class TestDemo {

    public static void main(String args[])
    {
        /*int a= 9;
        System.out.println("value of a is :"+a);

        float num1 = 2.23f;
        double num2 = 16.23;

        System.out.println("value of num1 is :"+num1);
        System.out.println("value of a num2 :"+num2);

        String name = "Preeja";
        System.out.println("My name is :"+name); */


        int Age = 10;
        String Gender = "Male";


        if (Age>0 && Age<18)
        {
            if (Gender == "Male")
            {
                System.out.println("User is a Boy");
            }
            else if (Gender== "Female")
            {
                System.out.println("User is a Girl");
            }
        }
        else if (Age>=18 && Age<60)
        {
            if (Gender == "Male")
            {
                System.out.println("User is a Man");
            }
            else if (Gender == "Female")
            {
                System.out.println("User is a Woman");
            }
        }
        else
        {
                System.out.println("User is a Senior Citizen");
        }

    }
}
