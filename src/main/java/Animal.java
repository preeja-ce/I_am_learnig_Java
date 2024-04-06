// super keyword in java example

// Base class vehicle
class Animal {

    public void speak(){
        System.out.println( "unique sounds");
    }
}

// sub class Car extending vehicle
class Dog extends Animal {
    //super();
    public void speak() {
        System.out.println("Dogs Bark");
    }


    void display()
    {

        // print maxSpeed of base class (vehicle)
        //System.out.println("Maximum Speed: "
         //       + super.maxSpeed);
    }
}

// Driver Program
class Test {
    public static void main(String[] args)
    {
        Dog a1 = new Dog();

        a1.speak();

    }
}
