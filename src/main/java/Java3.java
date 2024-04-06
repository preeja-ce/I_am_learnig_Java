public class Java3 {

    public static void main(String[] args) {
        Java3 d3 = new Java3();
        d3.printName("Preeja");
        int age = d3.Adulthood("Preeja", 30);
        System.out.println(" Preeja has outlived " +age + " years");


    }

    public String printName(String name){
        System.out.println( name);
        return name;
    }

    public int Adulthood(String name, int age){

        int adultYears= age-18;
        //System.out.println(name+ " has outlived " +adultYears + " years");
        return adultYears;
    }
}
