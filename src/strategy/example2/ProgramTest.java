package strategy.example2;

public class ProgramTest {
    public static void main(String[] args) {
        Program program = new Program();

        program.addStudent(new Student(10,"Wolverine"));
        program.addStudent(new Student(4,"Logan"));
        program.addStudent(new Student(8,"X-men"));

        program.addStudent(new Student(-18,"Shourob Dada"));

        //sort by number
       // System.out.println("=======Sort Student by Number========");
        //program.displayStudent(new NumberSorter());

        //sort by name
        System.out.println("=======Sort Student by Name========");
       program.displayStudent(new NameSorter());
    }
}
