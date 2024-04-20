package pkg1;

public class Animal {

    public String name;
    public int Age;
    public String surname;
    public int id;

    public void Animal(String naam, int umar, String surnaam, int Id){

        name = naam;
        Age = umar;
        surname = surnaam;
        id = Id;

        System.out.println(""+name+ id+ surname+ Age  );

    }


    public void eats(){

        System.out.println( "Animals eat");
    }

    public void sound(){

        System.out.println( "Animals make sounds");
    }

    private void gender(){

        System.out.println( "Gender is male");
    }

    protected void walk(){

    }

    void getDetails(){

        System.out.println( "This is get details method");
    }


    public static void main(String[] args) {
        Animal a1 = new Animal();
        a1.Animal("Olive",3,"Brunie",1);

        System.out.println(""+a1.name+ a1.id+ a1.surname+ a1.Age );
    }
}
