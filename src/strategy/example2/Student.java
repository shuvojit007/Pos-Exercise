package strategy.example2;

import java.util.List;


public class Student {
    private int matriculationNumber;
    private String name;

    public Student(int matriculationNumber, String name) {
        this.matriculationNumber = matriculationNumber;
        this.name = name;
    }

    public int getMatriculationNumber() {
        return matriculationNumber;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "matriculationNumber=" + matriculationNumber +
                ", name='" + name + '\'' +
                '}';
    }


}
