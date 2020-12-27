package composite.example1;

public class CompositeTest {
    public static void main(String[] args) {
        Leaf hd = new Leaf(2850,"HDD");
        Leaf mouse = new Leaf(500,"MOUSE");
        Leaf monitor = new Leaf(4500,"MONITOR");
        Leaf ram = new Leaf(3000,"RAM");
        Leaf cpu = new Leaf(8000,"CPU");


        Composite ph = new Composite("Peri");
       // Composite cabinet = new Composite("Cabinet");
        Composite mb = new Composite("MotherBoard");
        Composite computer = new Composite("Computer");

        mb.addComponent(cpu);
        mb.addComponent(ram);

        ph.addComponent(mouse);
        ph.addComponent(monitor);

//        cabinet.addComponent(hd);
//        cabinet.addComponent(mb);

        computer.addComponent(ph);
        computer.addComponent(mb);
       // computer.addComponent(cabinet);


        //computer.showPrice();

        mb.showPrice();
        //cabinet.showPrice();
    }
}
