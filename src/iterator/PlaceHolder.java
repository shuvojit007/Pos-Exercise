package iterator;

import iterator.example1.Topic;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PlaceHolder {
    @Test
    public void test(){


        List<School> list = new ArrayList<>();

        list.add(new School("Blue Bird"));
        list.add(new School("Pilot"));
        list.add(new School("bgps"));
        list.add(new School("abc"));

        list.forEach(System.out::println);

        for(int i = 0;i<list.size();i++){
            School school = list.get(i);
            System.out.println(school);
        }
    }
}


class School {
    private String name;

    public School(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                '}';
    }
}