package strategy.example2;

import java.util.ArrayList;
import java.util.List;

public class Program {

    List<Student> students;

    public Program(){
        this.students= new ArrayList<>();
    }

    public void addStudent(Student student){
        this.students.add(student);
    }

    public void removeStudent(Student student){
        this.students.remove(student);
    }

    public void displayStudent( Sorter sorter){

        List<Student> std = sorter.sort(students);
        std.forEach(Student -> System.out.println(Student.toString()));
    }
}
