public class Reptile {

    public static void main(String[] args) {
            Reptile rep = new Reptile();
                    rep.printInfo("Snake","Red");
    }

    public void printInfo(String name, String color){
        if (color == "Red"){
            System.out.println("Reptile "+name+ " is dangerous because color is "+color);
        }
    }
}
