package pkg2;

import pkg1.Animal;
import pkg1.Dog;

public class Lion extends Animal {

    public void eats(){

        System.out.println( "Lion eats meat");
    }

    public void sound(){

        System.out.println( "Lion roars");
    }


    public static void main(String[] args) {
        Animal lion = new Lion();
        lion.eats();
        lion.sound();



    }
}
