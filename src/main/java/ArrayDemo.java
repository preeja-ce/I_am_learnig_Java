public class ArrayDemo {

    String[] studentName=new String[5];

    public static void main(String[] args) {
        ArrayDemo a = new ArrayDemo();
        a.addStudentName();
        a.getStudentName(3);
        a.getAllStudentName();

    }

    public void addStudentName() {
        studentName[0]= "Preeja";
        studentName[1]= "Akhil";
        studentName[2]= "Derrick";
        studentName[3]= "Abhishek";
        studentName[4]= "Pooja";
        System.out.println("Added Students to Array successfully");
    }
    public void getStudentName(int index) {
        System.out.println("Student at " +index+ " position is " +studentName[index]);
    }

    public void getAllStudentName(){
        for(int i=0;i<studentName.length;i++) {
                System.out.println("Student at "+i+ " position is " +studentName[i]);
            }
        }
    }

