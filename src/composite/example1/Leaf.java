package composite.example1;

public class Leaf implements Component{
    int price;
    String name;

    public Leaf(int price, String name) {
        this.price = price;
        this.name = name;
    }

    @Override
    public void showPrice() {
        System.out.println("Name : "+name+" Price : "+price);
    }
}
