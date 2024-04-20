package pkg1;

public class Dog extends Animal{

    public void eats(){

        System.out.println( "Dog eats chimken");
    }

    public void sound(){

        System.out.println( "Dog barks");
    }


    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.eats();
        dog.sound();



    }



}
