package pkg1;

public class Human {

    public void eats(){

        System.out.println( "Human eats");
    }

    public static void main(String[] args) {


    Animal social = new Animal();
    social.eats();
    //social.gender();
        social.walk();
        social.getDetails();

        social.id = 2;
        social.Age= 4;
        social.name = "Bruno";
        social.surname = "Mars";

        social.Animal(social.name,social.Age,social.surname,social.id);

    }


}
