
public class if_else {
    public static void main(String[] args) {
        int age = 60;
        String Gender = "female";

        if (age >= 8 && age <= 10) {
            if (Gender == "male")
                System.out.println("this is boy");
            else if (Gender == "female")
                System.out.println("this is girl");
        }
         else if (age >= 11 && age <= 20)
        {
            if (Gender == "male") {
                System.out.println("this is teenage boy");
            }
            else System.out.println("this is teenage girl");
        } else if (age >= 20 && age < 60) {
            if (Gender == "male")
                System.out.println("this is Man");
            else
                System.out.println("this is Woman");
        } else if (age >= 60) {
            System.out.println("this is senior citizen");
        } else {
            System.out.println("not valid");
        }

        int i=0;
         int j=10;
         int shreyansh = 0;
         //declaration assigment
        // condition
        //
        while(i<=j-i)
        {
            System.out.println( "I am Preeja "+i);
            i++;
        }
        i =0;j=10;

        do {
            System.out.println( "Do While - I am Preeja "+i);
            i++;
        }
        while(i<=j-i);




        for(i=0;i<=j-i;i++){
            System.out.println( "I am Shreyansh "+i);
        }

/*

        for(shreyansh=0;shreyansh<=j-shreyansh;shreyansh++){
            System.out.println( ""+i);
        }

*/


    }
    //i=0;



}





/*

        if (age>=8 && age<=10 && Gender=="male")
        {
            System.out.println("this is boy");

        }else if(age>=8 && age<=10 && Gender=="female")
        {
            System.out.println("this is girl");
        }else if(age>=11 && age<=20 && Gender=="male")
        {
            System.out.println("this is teenage boy");
        }else if(age>=11 && age<=20 && Gender=="female")
        {
            System.out.println("this is teenage girl");
        }else if(age>=20 && age<=60 && Gender=="male")
        {
            System.out.println("this is men");
        }else if(age>=20 && age<=60 && Gender=="female")
        {
            System.out.println("this is women");
        }else if (age>60)
        {
            System.out.println("this is senior citizen");
        }else
        {
            System.out.println("not valid");
        }


    }
}
*/