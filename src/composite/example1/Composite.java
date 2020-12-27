package composite.example1;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {

    String name;
    List<Component> components; //list of leaf

    public Composite(String name) {
        this.name = name;
        components = new ArrayList<>();
    }

    public void addComponent(Component com){
        this.components.add(com);
    }

    public void removeComponent(Component com){
        this.components.remove(com);
    }

    @Override
    public void showPrice() {
        System.out.println(name);
        for (Component c :components){
            c.showPrice();
        }
    }
}
