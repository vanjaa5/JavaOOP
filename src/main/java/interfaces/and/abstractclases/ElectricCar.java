package interfaces.and.abstractclases;

public class ElectricCar  implements CarInterface{

    public String name;

    public ElectricCar(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void start() {
        System.out.println(this);
        System.out.println("Electricity Flow started...");
    }

    @Override
    public void move(int speed) {
        System.out.println(name + "is moving at " + speed + " mph");
    }
}
