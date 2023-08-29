package interfaces.and.abstractclases;

public class FossilFuelCar implements CarInterface,TestInterface{

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FossilFuelCar(String name) {
        this.name = name;
    }

    @Override
    public void start() {

    }

    @Override
    public void move(int speed) {

    }

    @Override
    public void printName(String name) {

    }
}
