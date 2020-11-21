package strategy.example2;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class NumberSorter implements Sorter {

    @Override
    public List<Student> sort(List<Student> list) {

        return list.stream()
                .sorted(Comparator
                        .comparing(Student::getMatriculationNumber))
                .collect(Collectors.toList());



    }
}
