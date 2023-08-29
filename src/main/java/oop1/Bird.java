package oop1;

public class Bird extends Animal{


    private  int wings;

    public Bird(String name, String color, int legs, boolean hasTale, int wings) {
        super(name, color, legs, hasTale);
        this.wings = wings;
    }

    public void fly(){
        System.out.println(this.getName() + " is flying");
    }

    public void fly(int speed){
        System.out.println(this.getName() + "flaying speed " + speed);
    }
    public int getWings() {
        return wings;
    }

    public void setWings(int wings) {
        this.wings = wings;
    }

    @Override
    public void eat(String food) {
        super.eat(food);
        System.out.println("Eating finished");
    }
}
